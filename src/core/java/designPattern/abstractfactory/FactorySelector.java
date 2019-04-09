package core.java.designPattern.abstractfactory;

public class FactorySelector {
	
	public AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("bank")) {
			return new BankFactory();
		}
		if (choice.equalsIgnoreCase("loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
