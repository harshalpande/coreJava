package core.stringInterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class FindDuplicateChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String abc = "";
		findDuplicate(abc);
	}

	private static void findDuplicate(String str) {

		if (str != null && str.isEmpty()) {
			return;
		}

		char[] charArray = str.toCharArray();

		HashMap<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char tempChar = charArray[i];
			boolean isFound = searchInMap(tempChar, charMap);
			if (isFound) {
				Integer intOccurance = charMap.get(tempChar) + 1;
				charMap.put(tempChar, intOccurance);
			} else {
				charMap.put(tempChar, 1);
			}
		}

		// print all the repeated chars
		Iterator<Entry<Character, Integer>> iterator = charMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Character, Integer> next = iterator.next();
			if (next.getValue() > 1) {
				System.out.println(next.getKey());
			}
		}
	}

	private static boolean searchInMap(char tempChar, HashMap<Character, Integer> charMap) {
		return charMap.keySet().stream().filter(chr -> tempChar == chr.charValue()).findFirst().isPresent();
	}

}
