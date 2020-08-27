package core.java.designPattern.chainOfResponsibility;

import java.util.Scanner;

public class ChainOfResponsibilityImpl {

	public static void main(String[] args) {

		System.out.println("Welcome to Cash Withdrawl Kiosk : BOM");

		System.out.println("Please Enter the Amount");

		Scanner scanner = new Scanner(System.in);

		int amount = scanner.nextInt();

		System.out.println("The Amount entered by you is :" + amount);

		if (amount % 10 != 0) {
			System.out
					.println("You have entered an Invalid Amount. Please enter Amount in Denominations of 10's only.");
		} else {

			Notes thousandNote = new ThousandNote();
			Notes hundredNote = new HundredNote();
			Notes fiftyNote = new FiftyNote();
			Notes twentyNote = new TwentyNote();
			Notes tenNote = new TenNote();

			// Assign the Next Responsible in the chain
			thousandNote.next(hundredNote);
			hundredNote.next(fiftyNote);
			fiftyNote.next(twentyNote);
			twentyNote.next(tenNote);

			// Perform the operation only on the first responsible
			thousandNote.amount(amount); 

			System.out.println("Transaction Completed. Do Visit us again.");
		}
		scanner.close();
	}

}
