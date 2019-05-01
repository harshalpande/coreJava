package core.java.designPattern.proxy;

public class AccessGranter implements IAccessGranter {

	@Override
	public void grantAccess() {
		System.out.println("Access Granted to user ");
	}

}
