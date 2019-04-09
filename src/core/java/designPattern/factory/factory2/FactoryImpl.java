package core.java.designPattern.factory.factory2;

public class FactoryImpl {
	
	public static void main(String[] args) {
		MSEBFactory factory = new MSEBFactory();
		
		MSEBPlan housePlan = factory.loadEntityType("Home");
		housePlan.getGeneratedBill(40);

		MSEBPlan industryPlan = factory.loadEntityType("industry");
		industryPlan.getGeneratedBill(40);
		
		MSEBPlan schoolPlan = factory.loadEntityType("school");
		schoolPlan.getGeneratedBill(40);
		
		MSEBPlan commercialPlan = factory.loadEntityType("shop");
		commercialPlan.getGeneratedBill(40);
		
	}

}
