/* NAME: Joseph Seaton
 * CLASS: CSC-102-002 - Computer Science Principles
 * PROGRAM: program11
 * DESCRIPTION OF PROGRAM: Have the user input two numbers, a low and high number. Find all of the prime numbers between the low and high, and print them.
 * DESCRIPTION OF PROGRAM: Count how many prime numbers were found and if that number is prime, print "SUCCESS" an amount equal to the number of primes found, then tell the user the program has ended.
 * DESCRIPTION OF PROGRAM: If the number was not prime tell the user that they failed and need to try again. Loop the program until the user gets a successful prime number.
 * */

import java.util.Scanner;

public class program11 {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("WELCOME TO THE PRIME NUMBER COUNTING PROGRAM");
       int loop = 0;
       while ( loop == 0 ) {
       System.out.print("Enter the lower number => ");
       int LO = input.nextInt();
       System.out.print("Enter the higher number => ");
       int HI = input.nextInt();
       int count = 0;
       for (int i = LO; i <= HI; i++) {
           if (isPrime(i)) {
               System.out.println(i + " is a prime");
               count++;
           }// end if
       }// end for
       
       System.out.println(" ");
       
       if (isPrime(count) == false){
         System.out.println("There were " + count + " prime number(s). " + count + " is not a prime. FAIL. Try again.");
         System.out.println(" ");
       }// end if
       else {
         System.out.println("There were " + count + " prime number(s). " + count + " is a prime. Printing out \"SUCCESS\" " + count + " time(s).");
         for (int times = 1; times <= count; times++) {
           System.out.println("SUCCESS");
         }// end for
         System.out.println("Program ends.");
         loop = 1; //ENDS THE WHILE LOOP
       }// end else
       }// end while
   }// end main

   public static boolean isPrime(int n) {
     for(int i=2; i<=(int)Math.pow(n, 0.5); i++) {
       if(n%i==0) {
         return false;
       }// end if
     }// end for
     return true;
   }// end isPrime
}// end class