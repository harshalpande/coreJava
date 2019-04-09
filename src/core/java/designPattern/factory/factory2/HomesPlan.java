package core.java.designPattern.factory.factory2;

public class HomesPlan extends MSEBPlan {

	@Override
	double getRate() {
		return 3.5;
	}

	@Override
	String getEntityName() {
		return "HOME";
	}
}
