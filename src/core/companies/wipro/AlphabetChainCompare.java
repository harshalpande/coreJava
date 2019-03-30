package core.companies.wipro;

public class AlphabetChainCompare {

	public static boolean compare(String word1, String word2) {

		if (word1.length() != word2.length())
			return false;

		for (int i = 0; i < word1.length(); i++) {
			String rotatedWord = rotateWord(word2);
			if (word1.equals(rotatedWord)) {
				return true;
			} 
			word2 = rotatedWord;
		}

		return false;
	}

	private static String rotateWord(String str) {
		char[] newCharArr = new char[str.length()];
		char first = str.charAt(0);
		for (int i = 0; i < str.length() - 1; i++) {
			newCharArr[i] = str.charAt(i + 1);
		}
		newCharArr[str.length() - 1] = first;
		return String.valueOf(newCharArr);
	}

	public static void main(String[] args) {
		System.out.println(compare("snehal", "hlasne"));
	}

}
