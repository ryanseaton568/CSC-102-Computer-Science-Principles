//Joseph Seaton
import java.util.Scanner;

public class Game{
  public static void main (String[] args){
    Scanner cin = new Scanner (System.in);
    
    //Rock-paper-scissors-lizard-Spock
    //Intro to the Game
    System.out.println ("Welcome to Rock-paper-scissors-lizard-Spock! by Joseph Seaton");
    System.out.println ("Could you please give me your name?: ");
    String name = cin.next();
    System.out.println ("Hello " + name + "!");
    System.out.println ("The game is simple. I am only going to tell you how to play once.");
    System.out.println ("Scissors cuts paper, paper covers rock, rock crushes lizard, \nlizard poisons Spock, Spock smashes scissors, scissors decapatate lizard, \nlizard eats paper, paper disproves Spock, Spock vaporizes rock \nand, as it's always been, rock crushes scissors.");
    System.out.println ("Use this handy menu to pick your weapon! \n(1) Rock \n(2) Paper \n(3) Scissors \n(4) Lizard \n(5) Spock");
    //Play the game
    Scanner input = new Scanner (System.in);
    System.out.println ("So " + name + ", which weapon do you choose (pick a number)?: ");
    int number = input.nextInt();
    String weapon;
    if (number == 1)
      weapon = "Rock";
    else if (number == 2)
      weapon = "Paper";
    else if (number == 3)
      weapon = "Scissors";
    else if (number == 4)
      weapon = "Lizard";
    else
      weapon = "Spock";
    
    int randomNum = (int)((Math.random() *5) + 1);
    
    String computerWeapon = "";
    
    if (randomNum == 1)
      computerWeapon = "Rock";
    else if (randomNum == 2)
      computerWeapon = "Paper";
    else if (randomNum == 3)
      computerWeapon = "Scissors";
    else if (randomNum == 4)
      computerWeapon = "Lizard";
    else
      computerWeapon = "Spock";
    
    
    System.out.println ("You picked " + weapon + ", " + name + ".");
    System.out.println ("I picked " + computerWeapon + "."); 
    
    
    if (number == 1) { // Player Chose Rock!
      if (randomNum == 1)
        System.out.println("It's a tie! We both chose rock.");
      if (randomNum == 2)
        System.out.println("You lose, I chose paper, and paper covers rock.");
      if (randomNum == 3)
        System.out.println("You win, Rock smashes scissors.");
      if (randomNum == 4)
        System.out.println("You win, Rock crushes Lizard.");
      if (randomNum == 5)
        System.out.println("You lose, Spock vaporizes Rock.");
    }
    else if (number == 2) { // Player Chose Paper!
      if (randomNum == 1)
        System.out.println("You win, Paper covers Rock.");
      if (randomNum == 2)
        System.out.println("It's a tie! We both chose paper.");
      if (randomNum == 3)
        System.out.println("You lose, Scissors cuts paper.");
      if (randomNum == 4)
        System.out.println("You lose, Lizard eats Paper.");
      if (randomNum == 5)
        System.out.println("You win, Paper disproves Spock.");
      
    }
    else if (number == 3) { // Player Chose Scissors!
      if (randomNum == 1)
        System.out.println("You lose, Rock crushes Scissors.");
      if (randomNum == 2)
        System.out.println("You win, Scissors cuts Paper.");
      if (randomNum == 3)
        System.out.println("It's a tie! We both chose Scissors.");
      if (randomNum == 4)
        System.out.println("You win, Scissors decapitates Lizard.");
      if (randomNum == 5)
        System.out.println("You lose, Spock smashes Scissors.");
      
    }
    else if (number == 4) { // Player Chose Lizard!
      if (randomNum == 1)
        System.out.println("You lose, Rock crushes Lizard.");
      if (randomNum == 2)
        System.out.println("You win, Lizard eats Paper.");
      if (randomNum == 3)
        System.out.println("You lose, Scissors decapitates Lizard.");
      if (randomNum == 4)
        System.out.println("It's a tie! We both chose Lizard.");
      if (randomNum == 5)
        System.out.println("You win, Lizard poisons Spock.");
      
    }
    else { // Player Choose Spock!
      if (randomNum == 1)
        System.out.println("You win, Spock vaporizes Rock.");
      if (randomNum == 2)
        System.out.println("You lose, Paper disproves Spock.");
      if (randomNum == 3)
        System.out.println("You win, Spock smashes Scissors.");
      if (randomNum == 4)
        System.out.println("You lose, Lizard poisons Spock.");
      if (randomNum == 5)
        System.out.println("It's a tie! We both chose Spock.");
      
    }
    }//end class
}//end main