package core.java.designPattern.abstractfactory;

public class HousingLoan extends Loan{

	@Override
	void setInterestRate(double rate) {
		super.rate = rate;
	}

	@Override
	String getName() {
		super.name = "Housing";
		return name;
	}

}
