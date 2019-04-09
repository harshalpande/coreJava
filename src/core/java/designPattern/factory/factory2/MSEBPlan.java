package core.java.designPattern.factory.factory2;

public abstract class MSEBPlan {

	abstract String getEntityName();

	abstract double getRate();

	public void getGeneratedBill(double units) {
		System.out.println("Bill Generated for this " + getEntityName() + " is : " + getRate() * units);
	}

}
