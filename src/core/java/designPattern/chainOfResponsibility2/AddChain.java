package core.java.designPattern.chainOfResponsibility2;

public class AddChain implements IChain {

	private IChain addChain;

	@Override
	public void assignNext(IChain iChain) {
		this.addChain = iChain;
	}

	@Override
	public void calculate(Numbers request) {
		if (request.getMethodName().equalsIgnoreCase("add")) {
			System.out.println("Performing : " + request.getMethodName());
			System.out.println("Result : " + (request.getNumber1() + request.getNumber2()));
		} else {
			System.out.println("Can't perform " + request.getMethodName() + " in ADD, calling next Operation in Chain.");
			addChain.calculate(request);
		}

	}

}
