package com.codegnan.operatorexamples;

import java.util.Scanner;

	public class DiscountCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter total shopping amount: ");
	        double amount = scanner.nextDouble();

	        double discount = (amount >= 1000) ? 0.20 :
	                          (amount >= 500) ? 0.10 : 0.0;

	        double finalAmount = amount - (amount * discount);

	        System.out.println("Discount Applied: " + (discount * 100) + "%");
	        System.out.println("Final Amount after discount: " + finalAmount);
	        
	        scanner.close();
	    }
	}



