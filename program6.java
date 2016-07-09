/* AUTHOR: Joseph Seaton
 * PROGRAM: program6
 * DATE: 2/22/2015
 * DESCRIPTION OF PROBLEM: Need to find the Square Root of the three fence lengths three times. Need to also state rather the triangle is valid or equilateral.
 * DESCRIPTION OF INPUT/OUTPUT: Input a number for each fence length. Output is the square root of these lengths. Output will also say rather the triangle is valid/equilateral.
 * DESCRIPTION OF HOW ITS SOLVED: Used three formulas (s, answer, and answer2) that will find the square root of the three sides and determine rather the triangle is valid or not.
 * TEST CASE: If you input 3, 4.0, and 5 for the lengths, your square root will come out to be 6.0.
 * TEST CASE: If you input 6, 6, and 6 for the lengths it will name the area and the triangle as equilateral.
 * TEST CASE: If you input 1, 2, and 5 for the lengths it will display a error message.
 * */
import java.util.Scanner;

public class program6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to the Triangle Calculation Program");
    
    int x; // loop control variable
    
    for(x = 1; x <= 3; x++) {

      System.out.println("This is time #" + x);
    // Enter the first fence's length.
    System.out.print("Enter length of side 1 => ");
    double a = input.nextDouble();
    
    // Enter the second fence's length.
    System.out.print("Enter length of side 2 => ");
    double b = input.nextDouble();
    
    // Enter the third fence's length.
    System.out.print("Enter length of side 3 => ");
    double c = input.nextDouble();
    
    if( a  < 0 || b < 0 || c < 0){
        System.out.println("Please enter positive numbers only.");
    }//end if

    else{
    // Add the three lengths together and divide the sum by 2.
    double s = (a + b + c)/2;
    
    // Formula to find the Square Root.
    double answer = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    double answer2 = (s*(s-a)*(s-b)*(s-c));
    
    // Determine if the triangle is valid.
    if (answer2 <= 0) {
      System.out.println("Sorry - not a valid triangle!");
    }//end if
    
    else{
    System.out.println("Your triangle has an area of " + answer + ".");
    }//end else
    
    }//end else on line 40
    
    // Determine if the triangle is equilateral.
    if (a == b && b == c){
      System.out.println("This is an equilateral triangle!");
    }//end if

    System.out.println(" ");
    }//end for
    
  }//end main
}//end class