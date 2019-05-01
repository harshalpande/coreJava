package core.java.designPattern.builder.second;

public class MathBuilderImpl {
	
	public static void main(String[] args) {
		
		MathBuilder builder = new MathBuilder();
		
		builder.add(23.0);
		
		System.out.println(builder.cALCULATE());
		
		builder.multiply(4.32);

		System.out.println(builder.cALCULATE());
		
		builder.divide(2.475);
		
		System.out.println(builder.cALCULATE());
		
		builder.substract(24);
		
		System.out.println(builder.cALCULATE());
		
		builder.add(364.54);
		
		System.out.println(builder.cALCULATE());
		
	}

}
