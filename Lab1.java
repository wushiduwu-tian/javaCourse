//Scott Hodnefield
//Lab1.java

import java.util.Scanner; 

public class Lab1 { 
	
	public static void main(String[] args) {
		double test1, test2, test3;
		double avg;
		final double TEST_TOTAL = 3;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter test score 1: ");
		test1 = scanner.nextDouble();
		
		
		System.out.print("Enter test score 2: ");
		test2 = scanner.nextDouble();
		
		System.out.print("Enter test score 3: ");
		test3 = scanner.nextDouble();
		
		avg = (test1 + test2 + test3) / TEST_TOTAL; 
		
		System.out.println("Your average score is: " + avg);
		
		scanner.close();		
	}

}
