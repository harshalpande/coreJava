package core.java.designPattern.facade2;

public class GoldDigger extends AbstractMineWorker {

	@Override
	public void work() {
		System.out.println(name() + " digs gold successfully.");
	}

	@Override
	public String name() {
		return "KGF GOLD DIGGER";
	}

}
