package core.java.eight.interfaces;

@FunctionalInterface
public interface Interface1 {
	
	void calculate();
	
	
	default void returnValue() {
		System.out.println("Method from Interface 1");
	}

}
