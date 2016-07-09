/* NAME: Joseph Seaton
 * CLASS: CSC-102-002 - Computer Science Principles
 * PROGRAM: program12
 * DESCRIPTION OF PROGRAM: Read in from a file and tell how many numbers there are, and what each number is. Tell the
 * DESCRIPTION OF PROGRAM: user what the smallest and largest numbers are, as well as the average of all numbers and
 * DESCRIPTION OF PROGRAM: the standard deviation. Find the ((average-smallest)/standard deviation) and tell the user
 * DESCRIPTION OF PROGRAM: if the batch should be rejected.
 * */
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
public class program12{
  
  public static double smallest(double[] allBrownies) { /*Find the smallest brownie */
    double hold = allBrownies[0];
    for (int lcv = 0; lcv < allBrownies.length; lcv++) {
      if (allBrownies[lcv] < hold) {
        hold = allBrownies[lcv];
      }// end if
    }// end for
    return hold;
  }//end smallest
  
  public static double largest(double[] allBrownies) { /* Find the largest brownie */
    double hold = allBrownies[0];
    for (int lcv = 0; lcv < allBrownies.length; lcv++) {
      if (allBrownies[lcv] > hold) {
        hold = allBrownies[lcv];
      }// end if
    }// end for
    return hold;
  }//end largest
  
  public static double average (double [] allBrownies) { /* Find the brownie average */
    int lcv;
    double total = 0;
    for (lcv = 0; lcv < allBrownies.length; lcv++) {
      total = total + allBrownies[lcv];
    }// end for
    return total/allBrownies.length;
  }// end average
  
  public static double stdev (double [] allBrownies) { /* Find the brownie StDev */
    int lcv;
    double sum = 0.0;
    for (lcv = 0; lcv < allBrownies.length; lcv++) {
      sum = sum + Math.pow( (average(allBrownies) - allBrownies[lcv]),2.0);
    }// end for
    sum = sum / (allBrownies.length-1);
    sum = Math.pow(sum,0.5);
    return sum;
  }// end stdev
  
  public static double finalTot (double [] allBrownies) {
    double total = 0.0;
    double finalTest;
    finalTest = ((average(allBrownies) - smallest(allBrownies)) / stdev(allBrownies));
    total = total + finalTest;
    return total;
  }// end finalTot
  
  public static void main (String [] args) throws Exception {
    
    System.out.println("Welcome to the brownie quality program.");
    Scanner input = new Scanner(System.in);
    String filename;
    System.out.print("What is the name of the input file => ");
    filename = input.next();
    File myfile = new File (filename);
    Scanner fileIn = new Scanner (myfile);
    int numBrownies;
    numBrownies = fileIn.nextInt();
    double [] allBrownies = new double [numBrownies];
    int lcv;
    for (lcv = 0; lcv <numBrownies; lcv++) {
      allBrownies[lcv] = fileIn.nextDouble();
      }// end for
    System.out.println("There are " + lcv + " brownies.");
    System.out.println("The weights read in were:");
    for (lcv = 0; lcv < numBrownies; lcv++){
    System.out.println("\t"+ allBrownies[lcv]);
  }// end for
    
    /* Print the smallest/largest/average/StDev of the brownies */
    System.out.printf("The smallest was %5.2f ounces.%n", new Object[] { Double.valueOf(smallest(allBrownies)) });
    System.out.printf("The largest was %5.2f ounces.%n", new Object[] { Double.valueOf(largest(allBrownies)) });
    System.out.printf("The average is%6.2f%n",average(allBrownies));
    System.out.printf("The stdev is%6.2f%n",stdev(allBrownies));
    
    /* Decide to accept/reject the brownies */ 
    System.out.printf("The (average-smallest)/standard deviation is%6.2f%n",finalTot(allBrownies));
    if (finalTot(allBrownies) <= 1.5) {
      System.out.println("This is less than or equal to 1.5 - the batch is accepted.");
    }// end if
    else {
      System.out.println("This is greater than 1.5 - the batch is rejected.");
    }// end else
  }//end main
  
}// end class