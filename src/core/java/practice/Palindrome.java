package core.java.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = reader.nextLine();
		System.out.println(isPalindrome(word));
		reader.close();
	}

	private static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		int wordLen = word.length();
		int limit = wordLen / 2 + 1;
		for (int i = 0; i < limit; i++) {
			if (word.charAt(i) != word.charAt(wordLen - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
