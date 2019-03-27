package core.companies.hexaware.strLambda;

public class CharStringEval {
	
	public static void main(String[] args) {
		
		String str = "harshal";
		
		// 1. The Type of elem here is not char but INTEGER and output is ASCII values of chars in String str
		str.chars().forEach(elem -> {
			System.out.println(elem);
		});		
	}

}
