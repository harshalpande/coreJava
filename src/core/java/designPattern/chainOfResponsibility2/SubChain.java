package core.java.designPattern.chainOfResponsibility2;

public class SubChain implements IChain {

	private IChain subChain;

	@Override
	public void assignNext(IChain iChain) {
		this.subChain = iChain;
	}

	@Override
	public void calculate(Numbers request) {
		if (request.getMethodName().equalsIgnoreCase("sub")) {
			System.out.println("Performing : " + request.getMethodName());
			System.out.println("Result : " + (request.getNumber1() - request.getNumber2()));
		} else {
			System.out.println("Can't perform " + request.getMethodName() + " in SUB, calling next Operation in Chain.");
			subChain.calculate(request);
		}

	}

}
