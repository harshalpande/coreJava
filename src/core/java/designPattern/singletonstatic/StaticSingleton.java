package core.java.designPattern.singletonstatic;

/**
 * Can be thought of as one of the safest approach to design a singleton class
 * @author Harshal-Pande
 *
 */
public class StaticSingleton {
	
	// private constructor
	private StaticSingleton() {}
	
	private static class StaticHelper {
		public static StaticSingleton INSTANCE = new StaticSingleton();
	}
	
	public static StaticSingleton getInstance() {
		return StaticHelper.INSTANCE;
	}

}
