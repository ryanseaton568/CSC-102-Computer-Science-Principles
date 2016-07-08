/* AUTHOR: Joseph Seaton
 * PROGRAM: program2
 * DATE: 1/26/2015
 * DESCRIPTION OF PROBLEM: Need to be able to convert Celcius to Fahrenheit and vice versa.
 * DESCRIPTION OF INPUT/OUTPUT: Input a number for celsius1 and fahrenheit2. Output the conversion of those two numbers.
 * DESCRIPTION OF HOW ITS SOLVED: Used a formula that converted the input celcius/fahrenheit into the other temperature metric unit.
 * TEST CASE: If you input 100 for Celsius, your output for Fahrenheit will be 212.
 * TEST CASE: If you input 202 for Fahrenheit, your output for Celsius will be 100.
 * */
import java.util.Scanner;

public class program2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to the Dr. Who Temperature Conversion!");
    // Convert Celsius to Fahrenheit.
    System.out.print("Enter a temperature in Celsius => ");
    double celsius1 = input.nextDouble();
    double fahrenheit1 = (celsius1 * (9.0/5)) + 32;
    System.out.println("That is equivalent to " + fahrenheit1 + " degrees in Celsius.");
    
    // If Fahrenheit is greater than 150, display an error message.
    if (fahrenheit1 > 150){
      System.out.println("WARNING - this is over 150 degrees - the TARDIS will not stay shiny!");
    }//end if
    
    // Convert Fahrenheit to Celsius.
    System.out.print("Now enter a temperature in Fahrenheit => ");
    double fahrenheit2 = input.nextDouble();
    double celsius2 = (fahrenheit2 - 32) * (5.0/9);
    System.out.println("That is equivalent to " + celsius2 + " degrees in Celsius.");
    System.out.println(" ");
    System.out.println("Thank you, and have a great day!");
    
    
  }//end main
}//end class