package core.stringInterviewQuestions;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "harshal";
		String str2 = "larshah";
		System.out.println(isAnagram(str1, str2));
	}

	private static boolean isAnagram(String str1, String str2) {
		if (str1 == null && str2 == null) {
			return false;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		StringBuilder sb2 = new StringBuilder(str2);
		char[] chrArr = str1.toCharArray();

		for (char chr : chrArr) {
			sb2.deleteCharAt(sb2.indexOf(Character.toString(chr)));
		}
		return sb2.length() == 0 ? true : false;
	}
}
