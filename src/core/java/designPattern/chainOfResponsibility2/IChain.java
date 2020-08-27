package core.java.designPattern.chainOfResponsibility2;

public interface IChain {
	
	void assignNext(IChain iChain);
	
	void calculate(Numbers request);

}
