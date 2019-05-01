package core.java.designPattern.singleton;

public class SingletonExample {
	
	private static SingletonExample INSTANCE;
	
	private SingletonExample() {
		
	}

	public static SingletonExample getInstance() {
		if (INSTANCE == null)
			synchronized (INSTANCE) {
				return new SingletonExample();
			}
		return INSTANCE;
	}
	
	public String evaluate() {
		return "Hello World..!";
	}
}
