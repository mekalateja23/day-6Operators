package com.codegnan.operatorexamples;
import java.util.Scanner;

		public class GreetingHour {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter hour of the day (0–23): ");
		        int hour = scanner.nextInt();

		        String greeting = (hour >= 00 && hour < 12) ? "Good Morning" :
		                          (hour >= 12 && hour < 17) ? "Good Afternoon" :
		                          (hour >= 17 && hour < 24) ? "Good Evening" : "Good Night";

		        System.out.println(greeting);
		        scanner.close();
		    }
		}


	
