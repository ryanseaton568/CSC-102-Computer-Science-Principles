/* AUTHOR: Joseph Seaton
 * PROGRAM: program5
 * DATE: 2/12/2015
 * DESCRIPTION OF PROBLEM: Need to be able to find the Wind-Chill Temperature.
 * DESCRIPTION OF INPUT/OUTPUT: Input a number for wind speed and temperature. Output will tell Batman what the wind chill temp is.
 * DESCRIPTION OF HOW ITS SOLVED: Used IF and ELSE statements for gathering information from the user, and the Wind-Chill formula to find the answer to the question.
 * TEST CASE: If you input 6 for the wind speed and 5.3 for the temperature, the answer will be -5.61.
 * TEST CASE: If you input a wind speed that is 2 or less, or a windTemp not between -58 and 41, an error message will display.
 * */

import java.util.Scanner;

public class program5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Enter the Wind Speed.
    System.out.print("Enter wind speed (above 2 mph) => " );
    double wind = input.nextDouble();
    
    // Enter the Temperature.
    System.out.print("Enter temperature in Fahrenheit (between -58 and 41) => ");
    double temp = input.nextDouble();
    if ( (wind > 2) && (temp > -58 && temp < 41) ){
      double windTemp = 35.74 + (0.6125 * temp) - 35.75 * Math.pow(wind, 0.16) + (0.4275 * temp * Math.pow(wind, 0.16));
      System.out.println("The wind chill temperature is " + windTemp);
    }//end if
    
    else {
      System.out.println("Sorry, you did not enter valid input!");
    }//end else
    
    
  } //end main
} //end class