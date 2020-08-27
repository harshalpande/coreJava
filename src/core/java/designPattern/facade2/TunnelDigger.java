package core.java.designPattern.facade2;

public class TunnelDigger extends AbstractMineWorker {

	@Override
	public void work() {
		System.out.println(name() + " creates another promising tunnel.");
	}

	@Override
	public String name() {
		return "KGF TUNNEL DIGGER";
	}

}
