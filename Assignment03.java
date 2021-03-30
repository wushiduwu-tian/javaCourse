// CSE 110     : 15817 online 
// Assignment  : Assignment 3
// Author      : Scott Hodnefield 1205811226
// Description : Simple program to determine in one should hold, sell, or buy shares and how many.

import java.util.Scanner; 

public class Assignment03 {

	public static void main(String[] args) {
		
		Scanner stonksIn = new Scanner(System.in);
		
		final int TRANSACTION_FEE = 10;
		int currentShares = 0, marketPrice = 0, purchasePrice = 0, availableFunds = 0;
		
		System.out.print("Current Shares  : ");
		currentShares = stonksIn.nextInt();
		System.out.print("Market Price    : ");
		marketPrice = stonksIn.nextInt();
		System.out.print("Purchase Price  : ");		
		purchasePrice = stonksIn.nextInt();
		System.out.print("Available Funds : ");
		availableFunds = stonksIn.nextInt();		
		
		int numberSharesToBuy = (int) Math.floor((availableFunds - TRANSACTION_FEE) / marketPrice);
		int grossSale = (marketPrice - TRANSACTION_FEE) * currentShares;
		int perShareBuyValue = purchasePrice - marketPrice;
		
		
		if (perShareBuyValue > 0 && numberSharesToBuy > 0) {
			System.out.println("Buy "+ numberSharesToBuy + " shares");
		}
		
		else if (marketPrice > purchasePrice && grossSale != purchasePrice) {
			System.out.println("Sell " + currentShares + " shares");		
		}
		
		else {
			System.out.println("Hold shares");
		}
		stonksIn.close();
	}
}
