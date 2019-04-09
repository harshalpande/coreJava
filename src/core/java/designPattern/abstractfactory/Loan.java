package core.java.designPattern.abstractfactory;

public abstract class Loan {
	
	String name;

	double rate;
	
	abstract String getName();

	/**
	 * un-implemented abstract method so that extending class should implement it.
	 * 
	 * @param rate
	 */
	abstract void setInterestRate(double rate);

	/**
	 * Abstract Class Method - its formula can be used for any class extending it
	 * 
	 * @param loanAmount
	 * @param noOfYears
	 */
	void calculateLoanPayment(double loanAmount, int noOfYears) {

		double EMI;
		int n;

		n = noOfYears * 12;
		rate = rate / 1200;
		EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
		System.out.println(EMI);
	}

}
