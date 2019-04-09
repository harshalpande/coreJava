package core.java.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner scannerObj = new Scanner(System.in);
		String stringToParse = scannerObj.next();
		char[] charArr = stringToParse.toCharArray();

		StringBuilder outputString = new StringBuilder();
		String tempVar = null;
		int count = 0;
		boolean isfirstChar = false;
		for (int i = 0; i < charArr.length; i++) {
			if (i == 0) {
				isfirstChar = true;
			} 
			char pointerChar = charArr[i];
			if (isfirstChar /*&& !tempVar.equals(String.valueOf(pointerChar))/* && tempVar.equals(String.valueOf(pointerChar)) */) {
				// increment the existing char count
				isfirstChar = false;
				tempVar = String.valueOf(pointerChar);
				count++;
			} else {
				if (tempVar.equals(String.valueOf(pointerChar))) {
					count++;
				} else {
					isfirstChar = true;
					tempVar = null;
					count = 0;
					i = i - 1;
				}
				outputString.append(tempVar).append(String.valueOf(count));
				
			}
		}
		// outputString.append(tempvar).append(String.valueOf(count));
		System.out.println(outputString.toString());
	}
}
