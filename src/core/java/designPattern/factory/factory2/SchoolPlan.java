package core.java.designPattern.factory.factory2;

public class SchoolPlan extends MSEBPlan {

	@Override
	double getRate() {
		return 1.5;
	}

	@Override
	String getEntityName() {
		return "SCHOOL";
	}

}
