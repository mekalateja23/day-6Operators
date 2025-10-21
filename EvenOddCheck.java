package com.codegnan.operatorexamples;
		import java.util.Scanner;

			public class EvenOddCheck {
			    public static void main(String[] args) {
			        Scanner scanner = new Scanner(System.in);

			        // Prompt user to enter a number
			        System.out.println("Enter a number:");
			        int number = scanner.nextInt();

			        // Check if the number is even or odd
			        if (number % 2 == 0) {
			            System.out.println("The number is Even.");
			        } else {
			            System.out.println("The number is Odd.");
			        }

			        scanner.close();
			        
	}

}
