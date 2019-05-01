package core.java.designPattern.abstractfactory.abstractfactory1;

public class LoanFactory extends AbstractFactory {

	Loan housingLoan = new HousingLoan();
	Loan personalLoan = new PersonalLoan();
	Loan carLoan = new CarLoan();

	public Loan getLoan(String loanName) {
		if (housingLoan.getName().equalsIgnoreCase(loanName)) {
			return housingLoan;
		}
		if (carLoan.getName().equalsIgnoreCase(loanName)) {
			return carLoan;
		}
		if (personalLoan.getName().equalsIgnoreCase(loanName)) {
			return personalLoan;
		}
		return null;
	}

	@Override
	public Bank getBank(String bankName) {
		return null;
	}
}
