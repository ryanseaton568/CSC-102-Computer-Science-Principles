/* AUTHOR: Joseph Seaton
 * PROGRAM: program7
 * DATE: 3/20/2015
 * DESCRIPTION OF PROBLEM: Find the Cubic Meters of the room and decide rather the Stinker can effectively "fumigate" a room or not.
 * DESCRIPTION OF INPUT/OUTPUT: Input the dimensions of a Rectangular or Circular room, the output will state the Cubic Meters of the room and rather The Stinker will be able to stink it up or not.
 * DESCRIPTION OF HOW ITS SOLVED: It's solved by finding the cubic formula, then if the cubic meters of a room are less than 1000, the Stinker will be deemed non-threating. If the cubic meter is 1000+ however, he will be considered a threat.
 * TEST CASE: Enter "rectangle" (or any word beginning with r or just r), input height => 15, width => 14, length => 13. The answer will be 2730 cubic meters. The Stinker will also be effective.
 * TEST CASE: Enter "circular" (or any word beginning with c or just c), input height => 3, diameter => 4. The volume will be 37.692 cubic meters and The Stinker will be ineffective.
 * TEST CASE: Input any word/letter that DOES NOT begin with Q, R or C. You can use lower-case. You'll get an error message.
 * TEST CASE: Input "quit" (or any word beginning with q or just q). The program will stop and display a message saying that it has done so.
 * */
import java.util.Scanner;

public class Program7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Decide the shape.
    char shape = 'z';
    //While loop will keep the program looping until user inputs "Quit"
    while (shape != 'q'){
    System.out.println("Is the room rectangular or circular => ");
    String room = input.next();
    shape = room.charAt(0);
    // If the room is Circular
    if (shape == 'c' || shape == 'C' ) {
      System.out.print("What is the height => ");
      double height = input.nextDouble();
      System.out.print("What is the diameter => ");
      double diameter = input.nextDouble();
      double cubic1 = 3.141 * (diameter / 2) * (diameter / 2) * height; //Cubic Meters
      System.out.print("The room has a volume of " + cubic1 + " cubic meters. ");
      if (cubic1 < 1000) {
        System.out.println("The Stinker will be ineffective.");
      }// end if
        else{
          System.out.println("The Stinker will be effective!");
        }//end else
    }//end if line 10
    
    // If the room is Rectangular
    else if (shape == 'r'|| shape == 'R'){
      System.out.print("What is the height => ");
      double height2 = input.nextDouble();
      System.out.print("What is the width => ");
      double width = input.nextDouble();
      System.out.print("What is the length => ");
      double length = input.nextDouble();
      double cubic2 = width * length * height2; //Cubic Meters
      System.out.print("The room has a volume of " + cubic2 + " cubic meters. ");
      if (cubic2 < 1000) {
        System.out.println("The Stinker will be ineffective.");
      }//end if
        else {
          System.out.println("The Stinker will be effective!");
        }// end else
    }//end else-if line 26
    
    // Quit the Program
    else if (shape == 'q' || shape == 'Q') {
      System.out.println("Program ended.");
    }//end else-if
    
    // User Error in the Program
    else{
      System.out.println("Sorry - invalid input.");
    }// end else
    }//end while
  }//end main
}// end class