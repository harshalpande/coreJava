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
			amount = thousandNote.amount(amount);

			Notes hundredNote = new HundredNote();
			hundredNote = thousandNote.next(hundredNote);
			amount = hundredNote.amount(amount);

			Notes fiftyNote = new FiftyNote();
			fiftyNote = hundredNote.next(fiftyNote);
			amount = fiftyNote.amount(amount);

			Notes twentyNote = new TwentyNote();
			twentyNote = fiftyNote.next(twentyNote);
			amount = twentyNote.amount(amount);

			Notes tenNote = new TenNote();
			tenNote = twentyNote.next(tenNote);
			amount = tenNote.amount(amount);

			System.out.println("Transaction Completed. Do Visit us again.");
		}
		scanner.close();

	}

}
