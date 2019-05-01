package core.java.designPattern.abstractfactory.abstractfactory1;

public class PersonalLoan extends Loan{

	@Override
	void setInterestRate(double rate) {
		super.rate = rate;
	}

	@Override
	String getName() {
		super.name = "Personal";
		return name;
	}

}
