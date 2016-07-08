/* AUTHOR: Joseph Seaton
 * PROGRAM: program3
 * DATE: 2/2/2015
 * DESCRIPTION OF PROBLEM: Need to find the Square Root of the three fence lengths.
 * DESCRIPTION OF INPUT/OUTPUT: Input a number for each fence length. Output is the square root of these lengths.
 * DESCRIPTION OF HOW ITS SOLVED: Used two formulas (s and answer) that will find the square root of the three sides
 * TEST CASE: If you input 3, 4, and 5 for the lengths, your square root will come out to be 6.0.
 * */
import java.util.Scanner;

public class program3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to the Batman Evildoers Fencing Area Calculation Estimation Program (BEFACE)");
    
    // Enter the first fence's length.
    System.out.print("Enter length of side 1 => ");
    double a = input.nextDouble();
    
    // Enter the second fence's length.
    System.out.print("Enter length of side 2 => ");
    double b = input.nextDouble();
    
    // Enter the third fence's length.
    System.out.print("Enter length of side 3 => ");
    double c = input.nextDouble();
    
    // Add the three lengths together and divide the sum by 2.
    double s = (a + b + c)/2;
    
    // Formula to find the Square Root.
    double answer = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    
    System.out.println("Batman, the fenced in area has a size of " + answer);
    
    
  }//end main
}//end class