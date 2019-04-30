package core.companies.city;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a Array of length n which contains only 3 literals '1', '2' and '3'
 * Arrange them such that 1 goes to left, and 2 goes to right for e.g.
 * 231323112321 ==> 111133332222 `
 * 
 * @author Harshal S Pande
 *
 */
public class CitiSortExample2 {

	public static String str = "33223232323211232323211";

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		char[] charArray = str.toCharArray();
		for (char chr : charArray) {
			if (chr == '1') {
				Integer integer = map.get('1');
				if (integer == null)
					integer = 0;
				map.put('1', integer + 1);
			}
			if (chr == '2') {
				Integer integer = map.get('2');
				if (integer == null)
					integer = 0;
				map.put('2', integer + 1);
			}
			if (chr == '3') {
				Integer integer = map.get('3');
				if (integer == null)
					integer = 0;
				map.put('3', integer + 1);
			}
		}

		System.out.println(assembleString(map));
	}

	private static String assembleString(Map<Character, Integer> map) {
		StringBuilder sb = new StringBuilder();
		Integer val1 = map.get('1');
		Integer val3 = map.get('3');
		Integer val2 = map.get('2');

		return sb
				.append(newBumpedString('1', val1))
				.append(newBumpedString('3', val3))
				.append(newBumpedString('2', val2))
				.toString();

	}

	private static String newBumpedString(char c, Integer value) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < value; i++) {
			sb.append(c);
		}
		return sb.toString();
	}

}
