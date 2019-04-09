package core.java.designPattern.doublyLockedSingleton;

import java.util.concurrent.Callable;

public class DoubleSingletonImplementation {

	public static void main(String[] args) {

		Callable<Employee> callableThread1 = new Callable<Employee>() {

			@Override
			public Employee call() throws Exception {
				return Employee.getInstance();
			}
		};
		Callable<Employee> callableThread2 = new Callable<Employee>() {

			@Override
			public Employee call() throws Exception {
				return Employee.getInstance();
			}
		};

		Employee employee1 = null, employee2 = null;
		try {
			employee1 = callableThread1.call();
			employee2 = callableThread2.call();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (employee1.equals(employee2) && employee1.hashCode() == employee2.hashCode()) {
			System.out.println("Both Class are Equal");
		} else {
			System.out.println("Classes are different");
		}
	}
}
