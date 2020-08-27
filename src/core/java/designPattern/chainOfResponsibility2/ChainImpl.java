package core.java.designPattern.chainOfResponsibility2;

import java.util.Scanner;

public class ChainImpl {
	public static void main(String[] args) {

		IChain addChain = new AddChain();
		IChain subChain = new SubChain();
		IChain multChain = new MultChain();
		IChain divChain = new DivChain();

		/* Chaining Responsibilities here */
		addChain.assignNext(subChain);
		subChain.assignNext(multChain);
		multChain.assignNext(divChain);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int number1 = scan.nextInt();

		System.out.println("Enter Number 2");
		int number2 = scan.nextInt();

		System.out.println("Enter Operations Amongst add, sub, div, mult only");
		String operation = scan.next();

		Numbers numbers = new Numbers(number1, number2, operation);
		System.out.println("Operation is : " + numbers.getMethodName() + 
				" Numbers are : " + numbers.getNumber1() + ", "
				+ numbers.getNumber2());
		addChain.calculate(numbers);

	}
}
