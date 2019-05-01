package core.java.designPattern.proxy;

public class ProxyAccessGranter implements IAccessGranter {

	String userName;

	public ProxyAccessGranter(String userName) {
		this.userName = userName;
	}

	private boolean isUserAuthorized() {
		// call db operation or other java code to check the authority level of the
		// person,
		// which will determine if acess needs to be given to user with TRUE or FALSE

		if (userName.equals("PANDEHAR"))
			return true;
		return false;
	}

	@Override
	public void grantAccess() {
		if (isUserAuthorized()) {
			IAccessGranter accessGranter = new AccessGranter();
			accessGranter.grantAccess();
		} else {

			System.out.println("Access Can't be given to User.");
		}
	}

}
