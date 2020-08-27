package core.java.eight.interfaces;

public interface Interface2 {
	
	void calculate(int a, int b);
	
	default void returnValue() {
		System.out.println("Method from Interface 1");
	}

}
