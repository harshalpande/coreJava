package core.java.designPattern.factory.factory2;

public class MSEBFactory {

	public MSEBPlan loadEntityType(String entityName) {
		MSEBPlan homePlan = new HomesPlan();
		MSEBPlan commercialPlan = new CommercialPlan();
		MSEBPlan industryPlan = new IndustryPlan();
		MSEBPlan schoolPlan = new SchoolPlan();

		if (entityName.equalsIgnoreCase(homePlan.getEntityName())) {
			return homePlan;
		}
		if (entityName.equalsIgnoreCase(commercialPlan.getEntityName())) {
			return commercialPlan;
		}
		if (entityName.equalsIgnoreCase(schoolPlan.getEntityName())) {
			return schoolPlan;
		}
		if (entityName.equalsIgnoreCase(industryPlan.getEntityName())) {
			return industryPlan;
		}
		return null;
	}

}
