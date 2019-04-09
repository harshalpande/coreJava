package core.java.designPattern.factory.factory2;

public class CommercialPlan extends MSEBPlan {

	@Override
	double getRate() {
		return 12.3;
	}

	@Override
	String getEntityName() {
		return "SHOP";
	}

}
