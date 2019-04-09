package core.java.designPattern.facade;

public class FacadeImpl {

	public static void main(String[] args) {
		FacadeKeeper keeper = new FacadeKeeper();

		System.out.println(keeper.getApacheDS());
		System.out.println(keeper.getPostGreDS());
		System.out.println(keeper.getSpringDS());
	}

}
