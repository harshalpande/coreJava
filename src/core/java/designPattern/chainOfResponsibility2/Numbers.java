package core.java.designPattern.chainOfResponsibility2;

public class Numbers {

	int number1;
	int number2;
	String methodName;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Numbers(int number1, int number2, String methodName) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.methodName = methodName;
	}

}
