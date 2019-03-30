package core.companies.wipro;

public class NumberPattern {

	public static void getNumber(int size) {

		for (int i = 0; i < size; i++) {
			String firstLetter;
			StringBuilder builder = new StringBuilder();
			firstLetter = String.valueOf(i + 1);
			for (int j = 0; j < size; j++) {
				builder.append(firstLetter);
			}
			int firstNumber = i + 2;
			// for even
			if (firstNumber % 2 == 0) {
				System.out.println(String.valueOf(firstNumber).concat(builder.toString()));
			}
			// for odd
			else {
				System.out.println(builder.append(String.valueOf(firstNumber)).toString());
			}
		}
	}

	 public static void main(String[] args) {
		getNumber(8);
	}
}