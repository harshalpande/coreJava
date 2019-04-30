package core.stringInterviewQuestions;

public class CountVowels {

	public static void main(String[] args) {
		countVowels("aeiou");
	}

	private static void countVowels(String string) {
		char[] charArray = string.toCharArray();

		int count = 0;
		for (char chr : charArray) {
			boolean vowel = isVowel(chr);
			if (vowel)
				count++;
		}

		System.out.println(count + " number of vovels are present in " + string);

	}

	private static boolean isVowel(char chr) {
		boolean returnValue = false;

		switch (chr) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			returnValue = true;
			break;
		default:
			break;
		}
		return returnValue;
	}

}
