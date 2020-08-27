package core.companies.hexaware.strLambda;

import java.util.stream.Collectors;

public class CharStringEval {
	
	public static void main(String[] args) {
		
		String str = "harshal";
		
		// 1. The Type of elem here is not char but INTEGER and output is ASCII values of chars in String str
		str.chars().forEach(elem -> {
			System.out.println(Character.getName(elem));
		});		
		
		String collect = str.chars().parallel().mapToObj(p -> Character.getName(p)).map(p -> p.substring(p.length() - 1, p.length())).collect(Collectors.joining(", "));
		
		System.out.println(collect);
	}

}
