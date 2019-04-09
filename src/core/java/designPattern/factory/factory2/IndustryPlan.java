package core.java.designPattern.factory.factory2;

public class IndustryPlan extends MSEBPlan {

	@Override
	double getRate() {
		return 15;
	}

	@Override
	String getEntityName() {
		return "INDUSTRY";
	}

}
