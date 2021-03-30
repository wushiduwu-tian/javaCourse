//CSE 110: 
//Assignment: Assignment 1
//Scott Hodnefield 1205811226
//Program to allocate slices of pizza to a party of adults and children. 

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int slicesPer, numPizzas, adults, children; 
		
		System.out.print("Number of slices per pizza : ");
		slicesPer = input.nextInt();
		System.out.print("Number of pizzas purchased : ");
		numPizzas = input.nextInt();
		System.out.print("Number of adults           : ");
		adults = input.nextInt();
		System.out.print("Number of children         : ");
		children = input.nextInt();
		
		input.close(); 
		
		int totalSlices = slicesPer * numPizzas; 
		final int ADULT_SLICES = 3; //slices per adult 
		int totalAdultSlices = adults * ADULT_SLICES; //total number of slices allocated to adults
		int forChildren = totalSlices - totalAdultSlices; //remaining to be divided to children
		int perChild = forChildren / children; 
		int leftOvers = forChildren % children;
		
		
		System.out.println("Total number of slices of pizza               : " + totalSlices);
		System.out.println("Total number of slices given to adults        : " + totalAdultSlices);
		System.out.println("Total number of slices available for children : " + forChildren);
		System.out.println("Number of slices each child will get          : " + perChild);
		System.out.println("Number of slices left over                    : " + leftOvers);
	}
}
