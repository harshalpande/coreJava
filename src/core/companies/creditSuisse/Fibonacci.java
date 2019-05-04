package core.companies.creditSuisse;

/**
 * Fibonacci with Recurrsion
 * 
 * @author JavaBrains
 *
 */
public class Fibonacci {

	static int counter = 0;
	
	public static void main(String[] args) {

		int x = 0, y = 1;
		System.out.print(x);
		System.out.print(", " + y);
		doFibonacci(x, y);

	}

	private static void doFibonacci(int x, int y) {
		while (counter <= 10) {
			int z = x + y;
			System.out.print(", " + z);
			counter++;
			doFibonacci(y, z);
		}
	}

}
