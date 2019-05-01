package core.java.designPattern.abstractfactory.abstractfactory1;

public class BankFactory extends AbstractFactory {

	Bank sbi = new SBIBank();
	Bank kotak = new Kotak();
	Bank bom = new BankOfMaharashtra();

	public Bank getBank(String bankName) {
		if (sbi.getName().equalsIgnoreCase(bankName)) {
			return sbi;
		}
		if (kotak.getName().equalsIgnoreCase(bankName)) {
			return kotak;
		}
		if (bom.getName().equalsIgnoreCase(bankName)) {
			return bom;
		}
		return null;
	}

	@Override
	public Loan getLoan(String loanName) {
		return null;
	}

}
