package com.codegnan.operatorexamples;


import java.util.Scanner;
		
        public class LeapYear {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // user to enter a year
		        System.out.println("Enter a year:");
		        int year = scanner.nextInt();

		        // Check leap year condition
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println(year + " is a Leap Year.");
		        } else {
		            System.out.println(year + " is Not a Leap Year.");
		        }

		        scanner.close();
		    }
	}
