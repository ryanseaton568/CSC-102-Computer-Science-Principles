/* AUTHOR: Joseph Seaton
 * PROGRAM: program10
 * DATE: 4/14/2015
 * DESCRIPTION OF PROBLEM: Have the program tell Iron Man rather or not he can save someone based on their weight, which has its data stored in another file. If they weigh less than 200lb he can save them, if over that the Hulk needs to save them.
 * */

import java.io.File;
import java.util.Scanner;

public class program10 {
  public static void main(String[] args) throws Exception {
    
    File myFile = new File("rescue.txt");
    Scanner fileIn = new Scanner(myFile);
    int number = 0;

    number = fileIn.nextInt();
    System.out.println("There are " + number + " people.");
    int lcv;

    for (lcv = 1; lcv <= number; lcv++) {
      
      String name = fileIn.next();
      
      int weight = fileIn.nextInt();
      if (weight < 200) {
        System.out.println("I can save " + name + ".");
      }// end if
      else {
        System.out.println("I cannot save " + name + " - he needs to wait for the Hulk.");
      }// end else
    }// end for
    
  }// end main
}// end class