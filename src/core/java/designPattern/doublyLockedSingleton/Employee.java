package core.java.designPattern.doublyLockedSingleton;

public class Employee {

	private String name;
	private String city;

	private static Employee INSTANCE = getInstance();

	public static Employee getInstance() {
		if (INSTANCE == null) { 					// 1st Checking
			synchronized (Employee.class) { 		// Thread Safe Concurrency Established
				if (INSTANCE == null) { 			// 2nd Checking
					return new Employee("Harshal", "PUNE");
				}
			}
		}
		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
