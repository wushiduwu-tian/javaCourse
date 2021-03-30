//Author: Scott Hodnefield
//Filename: Lab4
//Specification: provide menu of math operations and outputs 
//For: CSE110- Lab #4
//Time Spent: 1 hr 

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner burger = new Scanner(System.in); 
		
		int choice = 0;
		int sumTo, factorial, leftMostDigit;
		
		do {displayMenu();
			choice = burger.nextInt();
			
			switch (choice) {
			
				case 1:
					System.out.println("Enter a number: ");
					sumTo = burger.nextInt();
					int sum = 0;
					for (int i = 1; i <= sumTo; i++) {
						sum += i; 
				}
				System.out.println("The sum of 1 to " + sumTo + " is " + sum);
				break;
				
				case 2:
					System.out.println("Enter a number: ");
					factorial = burger.nextInt();
					int factSum = 1;
					for (int i = factorial; i > 0; i--) {
						factSum *= i;
					}
					System.out.println("The factorial of 1 to " + factorial + " is " + factSum);
					break;
					
				case 3:
					System.out.println("Enter a number: ");
					leftMostDigit = burger.nextInt();
					int l = leftMostDigit;
					while (l > 9) {
						l /= 10;
					}
					System.out.println("The leftmost digit of " + leftMostDigit + " is " + l);
					break;
			}
		}

		while (choice != 4);
		
		System.out.print("Bye");
		
		burger.close();
	}
	private static void displayMenu() {        
		System.out.println("Please choose one option from the following menu:");        
		System.out.println("1) Calculate the sum of integers from 1 to m");        
		System.out.println("2) Calculate the factorial of a given number");        
		System.out.println("3) Display the leftmost digit of a given number");        
		System.out.println("4) Quit");    }
}
