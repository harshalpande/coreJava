package core.companies.bny.one;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashTest {
	
	public static void main(String[] args) {
		
		Set<Employee> hashset = new HashSet<>();
		
		System.out.println("Enter Value"); 
		
		Scanner scan = new Scanner(System.in);
		
		String nextLine = scan.nextLine();
		
		String[] values = nextLine.split("\\s");
		
		for (String str : values) {
			hashset.add(new Employee(Integer.valueOf(str)));
		}
		System.out.println(hashset.size());
		
		scan.close();
	}

}
