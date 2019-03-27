package core.companies.hexaware.interphace;

public class InterfaceInheritance {
	
	public static void main(String[] args) {
		IFunctional ifunc = new Beta();

		// 1. Beta Method will be executed at runtime
		ifunc.test();
		
		// 2. Class Cast Exception will occur at run time
		/*Alpha a = (Delta) ifunc;
		a.test();*/
	}

}
