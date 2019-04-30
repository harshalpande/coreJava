package core.stringInterviewQuestions;

public class StringReverseUsingSB {

	public static void main(String[] args) {
		System.out.println(reverse("harshal"));
	}

	private static String reverse(String string) {

		StringBuilder sb = new StringBuilder();

		char[] charArray = string.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}

		return sb.toString();

	}

}
