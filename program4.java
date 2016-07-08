/* AUTHOR: Joseph Seaton
 * PROGRAM: program4
 * DATE: 2/12/2015
 * DESCRIPTION OF PROBLEM: Need to be able to tell Batman what to wear depending on the Temperature/Percent input into the program.
 * DESCRIPTION OF INPUT/OUTPUT: Input a number for temp and percent. Output will tell Batman what to wear.
 * DESCRIPTION OF HOW ITS SOLVED: Used IF, ELSE-IF, AND ELSE statements to determine what Batman should wear, using the information from temp and percent.
 * TEST CASE: If you input temp => 30 and percent => 51, Output will be Heavy-duty wool blend, the BatGaloShoes, and carry the BatUmbrella. 
 * TEST CASE: If you input temp => 40 and percent => 30, Output will be lightweight wool blend and should not carry the BatUmbrella. 
 * */
import java.util.Scanner;

public class program4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello Batman. Welcome to the BatWeatherPrediction program.");
    System.out.print("What is the forecast temperature => ");
    double temp = input.nextDouble();
    System.out.print("What are the chances of precipitation (percentage) => ");
    double percent = input.nextDouble();
    
    if(temp < 40){
      System.out.println("Wear a heavy-duty wool blend.");
    }//end if
    
    else if( (temp >= 40) && (temp < 80) ){
      System.out.println("Wear a lightweight wool blend.");
    }//end else-if
    
    else{
      System.out.println("Wear a silk/cotton blend.");
    }//end else
    
    // END TEMPERATURE QUESTIONS
    
    if(percent > 50){
      System.out.println("You should carry the BatUmbrella");
    }// end if
    
    else{
      System.out.println("You should not carry the BatUmbrella");
    }// end else
    // END PERCENT QUESTIONS
    
    System.out.println("Have a great day fighting crime!");
    
    // EXTRA CREDIT
    
    if( (temp < 32) && (percent > 30) ){
      System.out.println("Remember to wear the BatGaloShoes!");
    } //end if
    
    
  }//end main
}//end class