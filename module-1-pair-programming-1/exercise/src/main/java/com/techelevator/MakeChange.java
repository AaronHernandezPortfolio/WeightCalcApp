package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner change = new Scanner(System.in);
		double amountOfBill = 0;
		double amountTendered = 0;
		double changeRequired = 0;

		String input = "";

		System.out.println("Please enter amount of the bill");
		input = change.nextLine();
		amountOfBill = Double.parseDouble(input);

		System.out.println("Please enter the amount tendered");
		input = change.nextLine();
		amountTendered = Double.parseDouble(input);

		changeRequired = amountTendered - amountOfBill;
		System.out.printf("Your change is " + changeRequired);

	}

}
