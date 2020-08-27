package core.java.designPattern.facade2;

public class CartOperator extends AbstractMineWorker {

	@Override
	public void work() {
		System.out.println(name() + " removes all the material");
	}

	@Override
	public String name() {
		return "KGF CART WORKER";
	}

}
