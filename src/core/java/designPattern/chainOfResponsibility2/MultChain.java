package core.java.designPattern.chainOfResponsibility2;

public class MultChain implements IChain {

	private IChain multChain;

	@Override
	public void assignNext(IChain iChain) {
		this.multChain = iChain;
	}

	@Override
	public void calculate(Numbers request) {
		if (request.getMethodName().equalsIgnoreCase("mult")) {
			System.out.println("Performing : " + request.getMethodName());
			System.out.println("Result : " + (request.getNumber1() * request.getNumber2()));
		} else {
			System.out.println("Can't perform " + request.getMethodName() + " in MULT, calling next Operation in Chain.");
			multChain.calculate(request);
		}

	}

}
