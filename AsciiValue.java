package com.codegnan.operatorexamples;

 import java.util.Scanner;

		public class AsciiValue {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input: read a single character
		        char ch = scanner.next().charAt(0);
		        
		        // Convert character to ASCII value
		        int asciiValue = (int) ch;
		        
		        // Output: print ASCII value
		        System.out.println(asciiValue);
		        
		        scanner.close();
		    }
		

	}


