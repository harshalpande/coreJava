package core.companies.city;

/**
 * Given a Array of length n which contains only 3 literals '1', '2' and '3'
 * Arrange them such that 1 goes to left, and 3 goes to right for e.g.
 * 231323112321 ==> 111133332222 `
 * 
 * @author Harshal S Pande
 *
 */
public class CitiSortExample {

	public static String Arr = "33223232323211232323211";
	static char[] charArr = Arr.toCharArray();

	public static void main(String[] args) {
		char tp;
		boolean executed = false;
		do {
			executed = false;
			for (int i = 0; i < charArr.length - 1; i++) {
				String tempString = String.valueOf(charArr[i]);
				String tempNextString = String.valueOf(charArr[i + 1]);
				if (tempString.equals("2") && (tempNextString.equals("3") || tempNextString.equals("1"))) {
					tp = charArr[i];
					charArr[i] = charArr[i + 1];
					charArr[i + 1] = tp;
					executed = true;
				}
				if (tempString.equals("3") && tempNextString.equals("1")) {
					tp = charArr[i];
					charArr[i] = charArr[i + 1];
					charArr[i + 1] = tp;
					executed = true;
				}
			}
			System.out.println(String.valueOf(charArr) + executed);
		} while (executed == true);
	}
}
