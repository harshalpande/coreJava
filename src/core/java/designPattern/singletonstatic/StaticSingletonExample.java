package core.java.designPattern.singletonstatic;

public class StaticSingletonExample {

	public static void main(String[] args) {

		StaticSingleton ss1 = StaticSingleton.getInstance();
		System.out.println(ss1.hashCode());

		StaticSingleton ss2 = StaticSingleton.getInstance();
		System.out.println(ss2.hashCode());
	}
}
