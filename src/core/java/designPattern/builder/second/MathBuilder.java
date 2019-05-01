package core.java.designPattern.builder.second;

public class MathBuilder {

	private double number;

	public MathBuilder add(double num1) {
		number = number + num1;
		return this;
	}

	public MathBuilder substract(double num1) {
		number = number - num1;
		return this;
	}

	public MathBuilder multiply(double num1) {
		number = number * num1;
		return this;
	}

	public MathBuilder divide(double num1) {
		number = number / num1;
		return this;
	}
	
	public double cALCULATE() {
		return number;
	}

}
