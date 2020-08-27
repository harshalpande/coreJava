package core.java.designPattern.facade2;

public class FacadeImpl {

	public static void main(String[] args) {
		KGFFacade facade = new KGFFacade();
		
		facade.startNewDay();
		
		facade.digOutGold();
		
		facade.goToSleep();

	}
}
