package core.java.designPattern.abstractfactory;

public class CarLoan extends Loan{

	@Override
	void setInterestRate(double rate) {
		super.rate = rate;
	}

	@Override
	String getName() {
		super.name = "CAR";
		return name;
	}

}
