package com.codegnan.operatorexamples;

import java.util.Scanner;

		public class NumberCheck {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        //  enter a number
		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		    
		        String result = (number > 0) ? "Positive: "
		                       :(number < 0) ? "Negative"
		                       : "Zero";

		        // Display result
		        System.out.println("The number is " + result + ".");

		        scanner.close();
		        

	}

}
