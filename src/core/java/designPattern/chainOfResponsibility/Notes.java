package core.java.designPattern.chainOfResponsibility;

public abstract class Notes {

	public static final int THOUSAND = 1000;
	public static final int HUNDRED = 100;
	public static final int FIFTY = 50;
	public static final int TWENTY = 20;
	public static final int TEN = 10;

	int count = 0;

	int value;
	
	private Notes next;

	abstract int getFaceValue();

	public Integer amount(Integer amount) {
		value = getFaceValue();
		// Amount Should taken from value
		if (amount / value > 0) {
			count = amount / value;
			amount = amount % value;
			System.out.println(count + " Note(s) dispensed of Value : " + value + ". Balance Remaining : " + amount);
		} 
		
		// Assign to the next responsible 
		Notes next = getNext();
		// There is no one after LastResponsible (Ten Notes), hence null will be encountered
		if (next != null) next.amount(amount);		
		
		// get the Balanced Amount
		return amount;
	}

	public Notes next(Notes next) {
		this.next = next;
		return next;
	}
	
	public Notes getNext() {
		return next;
	}

}
