package core.java.designPattern.chainOfResponsibility2;

public class DivChain implements IChain {

	private IChain divChain;

	@Override
	public void assignNext(IChain iChain) {
		this.divChain = iChain;
	}

	@Override
	public void calculate(Numbers request) {
		if (request.getMethodName().equalsIgnoreCase("div")) {
			System.out.println("Performing : " + request.getMethodName());
			System.out.println("Result : " + (request.getNumber1() / request.getNumber2()));
		} else {
			System.out.println("Chain Ended: Only could perform Add, Sub, Mult and Div Operations");
		}
	}
}
