/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-08
 * This program converst inches to feet
 */

import java.util.Scanner;

public class InchesToFeet {
	public static void main(String[] args) {

		// All the dirty work happens in the 'convert()' method; let's call it here from the main method!
		convert();      
             
	}
   
	// This method asks the user for total inches and outputs the conversion to feet and inches
  public static void convert() {

	  // Create a new Scanner to read in input from user
	  Scanner scanner = new Scanner(System.in);
      
      // Prompt the user and then store their input in 'totalInches'
      System.out.println("Enter the number of inches:");
      int totalInches = scanner.nextInt();

      // Convert to feet and inches. 
	    // ex. if totalInches is 38, the output would be: 38 inches is 3 feet, and 2 inches
      // The variable 'totalInches' is the number of inches the user has entered



        // ========== INSERT YOUR CODE HERE ==========

      // Calculate feet using user inputted integer
      int feet = totalInches / 12;
      // Calculate remaining inches using user inputted integer
      int inches = totalInches % 12;

      //Output message showing answers to user
      System.out.println(totalInches + " inches is " + feet + " feet, and " + inches + " inches");

        
        
        
        
        
        
        
        // ===========================================
    
       scanner.close();   

   }

}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Using the input to calculate the feet and the remainder. I felt like using the totalInches
twice may not be the most efficient way to complete it, but it worked!



2. What will you always remember (never forget) from this exercise?
Get the program working the way I want and update it after



