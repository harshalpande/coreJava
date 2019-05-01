package core.java.designPattern.proxy;

public class ProxyMain {
	public static void main(String[] args) {

		IAccessGranter granter = new ProxyAccessGranter("PANDEHAR");
		granter.grantAccess();

	}
}
