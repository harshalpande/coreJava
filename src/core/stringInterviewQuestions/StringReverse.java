package core.stringInterviewQuestions;

public class StringReverse {

	public static String reverse(String str) {
		if (str != null && str.isEmpty()) {
			return null;
		}

		char[] strArray = str.toCharArray();

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			swapCharacters(strArray, i, j);
			i++;
			j--;
		}
		return new String(strArray);
	}

	private static void swapCharacters(char[] strArray, int i, int j) {
		char temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println(reverse("harshal"));
	}

}
