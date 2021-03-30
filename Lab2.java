/*-------------------------------------------------------------
// AUTHOR: Scott Hodnefield
// FILENAME: Lab2.java
// SPECIFICATION: manipulates name from user input.  checks string comparison 
// FOR: CSE110 25281
// TIME SPENT: 30 min
//-----------------------------------------------------------*/



import java.util.Scanner; 

public class Lab2 {

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int nameLength = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter first name: ");
		firstName = scanner.nextLine();
		System.out.print("Please enter last name: ");
		lastName = scanner.nextLine();
		
		fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
		
		System.out.println("Full name (in capitals): " + fullName); 
		
		nameLength = fullName.length(); 
		System.out.println("Length of full name: " + nameLength);
		
		String compare1 = new String("hack the planet!");
		String compare2 = "hack the planet!";
		
		if (compare1 == compare2) {
			System.out.println("String comparison using \"==\" sign works");
		}
		else {
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
		if (compare1.contentEquals(compare2)) {
			System.out.println("String comparison using \"equals\" method works");
		}
		else {
			System.out.println("String comparison using \"equals\" method does NOT work");
		}
		
		scanner.close(); 
	}
}
