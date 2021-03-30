/*------------------------------------------------------------- 
// AUTHOR: Scott Hodnefield
// FILENAME: Lab3
// SPECIFICATION: Final class grade calculator with input verification
// FOR: CSE 110- Lab #3
// TIME SPENT: 45 minutes
//-----------------------------------------------------------*/

import java.util.Scanner; 

public class Lab3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double homework = 0, midterm = 0, finalExam = 0;
		
		int i = 0;
		
		while (i < 3) {
			if (i == 0) {
				System.out.print("Enter your HOMEWORK grade: ");
				homework = scanner.nextDouble(); 
				if (homework < 0 || homework > 100) {
					System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100]");
				}
				else {
					i++;
				}
			}
			
			else if (i==1) {
				System.out.print("Enter your MIDTERM grade: ");
				midterm = scanner.nextDouble(); 
				if (midterm < 0 || midterm > 100) {
					System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100]");
				}
				else {
				i++;
				}
			}
			
			else if (i==2) {
				System.out.print("Enter your FINAL EXAM grade: ");
				finalExam = scanner.nextDouble(); 
				if (finalExam < 0 || finalExam > 200) {
					System.out.println("[ERR] Invalid input. A final grade should be in [0, 200]");
				}
				else {
					i++;
				}
			}
		}
		
		
		double totalWeighted = ((finalExam / 200) * 50) + (midterm * 0.25) + (homework * 0.25); 
				
		System.out.println("Student's Weighted Total is " + totalWeighted);
		
		if(totalWeighted >= 50) {
			System.out.println("Student has PASSED the class");
		}
		else {
			System.out.println("Student has FAILED the class");
		}
	}
}
