package core.java.designPattern.singleton;

public class MainClass {

	public static void main(String[] args) {

		// SingletonExample example = new SingletonExample();

		SingletonExample example = SingletonExample.getInstance();
		SingletonExample example2 = SingletonExample.getInstance();

		System.out.println(example.evaluate());
		System.out.println(example2.evaluate());

		System.out.println("Are Equal : " + example.equals(example2));
	}
}
