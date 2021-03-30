// CSE 110     : 15817 iCourse 
// Assignment  : Assignment 4
// Author      : Scott Hodnefield 1205811226
// Description : A guessing game

import java.util.Scanner;
import java.util.Random; 

public class Assignment04 {

	public static void main(String[] args) {
		boolean chooseOption = true;
	    while (chooseOption) {
		Scanner innanet = new Scanner(System.in);
		Random random = new Random();
		String yesNo = ""; 
		
		do {
		
		System.out.print("Guess the 3 digit number! ");
		String guess = innanet.next();
		
		int secret = random.nextInt(1000);
		String secretString = Integer.toString(secret);
		String zero = "0";
		if (secretString.length() == 2) {
			secretString = zero + secretString;
		}
		if (secretString.length() == 1) {
			secretString = zero + zero + secretString;
		}
				
		int matched = 0;
		int guesses = 0;
		
		do {
			guesses++;
			matched = 0;
				
			String guessSubString0 = guess.substring(0,1);
			String guessSubString1 = guess.substring(1,2);
			String guessSubString2 = guess.substring(2,3);
			
			String secretSubString0 = secretString.substring(0,1);
			String secretSubString1 = secretString.substring(1,2);						
			String secretSubString2 = secretString.substring(2,3);
						
			if (secretSubString0.contentEquals(guessSubString0)) {
				matched++;
			}
			if (secretSubString1.contentEquals(guessSubString1)) {
				matched++;
			}
			if (secretSubString2.contentEquals(guessSubString2)) {
				matched++;
			}
			if (matched != 3) {
				System.out.println("");
				System.out.println("Guess " + guesses + ": " + guess);
				System.out.println("You matched " + matched);
				System.out.print("Try again! ");
				guess = innanet.next();
			}
					
			if (matched == 3) {
				System.out.println("Congratulations! You guessed the right number in " + guesses + " guesses.");
				System.out.println("Would you like to play again (yes/no)?");
				yesNo = innanet.next();	
				if(yesNo.equals("no")) {
					chooseOption = false;
					System.out.println("Thanks for playing!");
					return;
				}	
			}
			}

		
		while (matched != 3);	
		}
		
		while (yesNo != "no");
		
		innanet.close();
	}
	}
}
