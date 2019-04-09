package core.java.designPattern.abstractfactory;

public class AbstractFactoryImpl {
	
	public static void main(String[] args) {
		FactorySelector selector = new FactorySelector();
		
		AbstractFactory bankAbstractFactory = selector.getFactory("bank");
		Bank sbiBank = bankAbstractFactory.getBank("sbi");
		System.out.println("Bank Selected :" + sbiBank.getName());
		
		AbstractFactory loanFactory = selector.getFactory("loan");
		Loan loan = loanFactory.getLoan("car");
		loan.setInterestRate(8.90);
		loan.calculateLoanPayment(450000, 7);
	}

}
