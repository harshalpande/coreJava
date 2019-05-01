package core.java.designPattern.abstractfactory.abstractfactory1;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bankName);
	
	public abstract Loan getLoan(String loanName);

}
