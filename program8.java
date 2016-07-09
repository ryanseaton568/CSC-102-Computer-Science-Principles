/* AUTHOR: Joseph Seaton
 * PROGRAM: program8
 * DATE: 3/25/2015
 * DESCRIPTION OF PROBLEM: Count the total numbers drawn by both the player and computer. If its a tie, the computer wins. Declare who wins and once someone hits 21, end the game. Once the game is ended announce that it is and state how... 
 * ...many times the player and computer both won.
 * */

import java.util.Scanner;

public class program8 {
  public static void main(String[] args) {
    System.out.println("Welcome to the 102 Blackjack program.");
    System.out.println(" ");
    
    // All variables used in the program
    int playerTot = 0;
    int compTot = 0;
    int LO;
    int HI;
    int card = 0;
    int card2 = 0;
    int card3 = 0;
    int card4 = 0;
    int playerwins = 0;
    int compwins = 0;
    
    
    // While loop to keep the program running until someone gets 21.
    while (playerTot != 21 && compTot != 21) {
    
    LO = 2;
    HI = 14;
    // Random card draws
    card = (int) (Math.random() * (HI - LO + 1.0)) + LO;
    card2 = (int) (Math.random() * (HI - LO + 1)) + LO;
    card3 = (int) (Math.random() * (HI - LO + 1)) + LO;
    card4 = (int) (Math.random() * (HI - LO + 1)) + LO;

    // Card 1 changes if 11 or above
    if (card == 11 || card == 12 || card == 13) {
      card = 10;
    }// end if
    else if (card == 14) {
      card = 11;
    }// end else-if
    
    // Card 2 changes if 11 or above
    if (card2 == 11 || card2 == 12 || card2 == 13) {
      card2 = 10;
    }// end if
    else if (card2 == 14) {
      card2 = 11;
    }// end else-if
    
    // Card 3 changes if 11 or above
    if (card3 == 11 || card3 == 12 || card3 == 13) {
      card3 = 10;
    }// end if
    else if (card3 == 14) {
      card3 = 11;
    }// end else-if
    
    // Card 4 changes if 11 or above
    if (card4 == 11 || card4 == 12 || card4 == 13) {
      card4 = 10;
    }// end if
    else if (card4 == 14) {
      card4 = 11;
    }// end else-if
    
    // Total number by combining the cards for both players
    playerTot = card + card2;
    compTot = card3 + card4;
    
    System.out.println("You have a  " + card + " and a " + card2 + " - total of " + playerTot);
    System.out.println("Computer has a " + card3 + " and a " + card4 + " - total of " + compTot);
    
    // If the player wins
    if (playerTot > compTot) {
      System.out.println("You win!");
      System.out.println(" ");
    }// end if
    
    // If the computer wins
    else if (compTot >= playerTot) {
      System.out.println("Computer wins.");
      System.out.println(" ");
    }// end else-if
    
    // Increase player win count
    if (playerTot > compTot) {
      playerwins = playerwins + 1;
    }// end if
    
    // Increase computer win count
    if (compTot >= playerTot) { 
      compwins = compwins + 1;
    }// end if
    
    // End the game
    if (playerTot == 21 || compTot == 21) {
      System.out.println("Somebody had 21 - the game is over");
      System.out.println("Number of times you won: " + playerwins);
      System.out.println("Number of times the computer won: " + compwins);
    }// end if
    
    }// end while on line 29
   
  }// end main
}// end class