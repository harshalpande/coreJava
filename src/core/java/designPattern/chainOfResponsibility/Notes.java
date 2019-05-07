package core.java.designPattern.chainOfResponsibility;

public abstract class Notes {

	public static final int THOUSAND = 1000;
	public static final int HUNDRED = 100;
	public static final int FIFTY = 50;
	public static final int TWENTY = 20;
	public static final int TEN = 10;

	int count = 0;

	int value;

	abstract int getFaceValue();

	public Integer amount(Integer amount) {
		value = getFaceValue();
		// Amount Should taken from value
		if (amount / value > 0) {
			count = amount / value;
			amount = amount % value;
			System.out.println(count + " Note(s) dispensed of Value : " + value + ". Balance Remaining : " + amount);
		}
		// get the Balanced Amount
		return amount;
	}

	public Notes next(Notes next) {
		return next;
	}

}
