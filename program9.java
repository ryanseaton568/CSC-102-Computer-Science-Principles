/* AUTHOR: Joseph Seaton
 * PROGRAM: program9
 * DATE: 4/6/2015
 * DESCRIPTION OF PROBLEM: Have Star Lord input his choice for an even or odd number, then depending on what total number ELOG rolls with his 2 dice, tell Star Lord his fate rather he guessed right or wrong.
 * */


import java.util.Scanner;
public class program9 {
  
  public static boolean guess ( int myguess ) {
    int dice1 = (int) (Math.random() * (6 - 1 + 1) ) + 1; 
    int dice2 = (int) (Math.random() * (6 - 1 + 1) ) + 1; 
    int total = dice1 + dice2;
    System.out.println("The dice thrown were a " + dice1 + " and a " + dice2);
    if (total % 2 == 0 && myguess ==1) {
      return true;
    } else if (total % 2 == 0 && myguess ==2) {
      return false;
    } else if (total % 2 == 1 && myguess ==1) {
      return false;
    } else if (total % 2 == 1 && myguess ==2) {
      return true;
    } else{
      return false;
    }// end else
  }
  public static void win() {
    System.out.println("You guessed right! You are free to escape and star in a sequel. Remember to water Groot.");
  }// end method win
  
  public static void lose() {
    System.out.println("You guessed wrong! Please, enjoy Jupiter Ascending and the popcorn is on me.");
  }//end method lose
  
  public static void main(String [] args) {
    System.out.println("Welcome to the program that will determine your fate, Star Lord!");
    int myguess;
    Scanner input = new Scanner(System.in);
    System.out.print("Do you guess even (enter a 1) or odd (enter a 2) => ");
    myguess = input.nextInt();
    if (guess (myguess) ) {
      win();
    }//end if
    else {
      lose();
    }// end else
  }// end main
  
}// end class