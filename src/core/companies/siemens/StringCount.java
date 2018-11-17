package core.companies.siemens;

import java.util.Scanner;

/**
 * 
 * This program takes input as in random string and counts the number of element
 * and prints it along with variable for e.g. aabbaabbccdd will give -
 * a2b2a2b2c2d2
 * 
 * @author Harshal S Pande
 *
 */
public class StringCount {

	public static void main(String[] args) {

		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the String:");
		String inputStr = scannerObj.next();
		char[] charArr = inputStr.toCharArray();

		// hold char var and its count by looping
		String tempChar = null;
		int count = 0;
		StringBuilder resultString = new StringBuilder();

		for (int i = 0; i < charArr.length; i++) {
			// hold value of current variable and next variable
			char currentChar = charArr[i];
			char nextChar = 0;
			if ((i + 1) < charArr.length) {
				nextChar = charArr[i + 1];
			}
			count = count + 1;
			tempChar = String.valueOf(currentChar);
			if (nextChar != 0) {
				if (currentChar != nextChar) {
					resultString.append(tempChar).append(String.valueOf(count));
					count = 0;
				}
			} else {
				resultString.append(tempChar).append(String.valueOf(count));
			}
		}
		scannerObj.close();
		System.out.println(resultString.toString());
	}
}
