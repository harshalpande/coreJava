package core.stringInterviewQuestions;

import java.util.regex.Pattern;

public class ContainNumbers {
	
	/**
	 * \d - numbers
	 * \D - non-numbers
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Pattern pattern = Pattern.compile(".*\\d.*"); one or more than one number in string
		
		//Pattern pattern = Pattern.compile(".*\\D.*"); one or more than one alphabet in string
		
		Pattern pattern = Pattern.compile("\\d{6}"); // fixed 6 digit numbers only
		
		
		System.out.println(pattern.matcher("432904").matches());
	}

}
