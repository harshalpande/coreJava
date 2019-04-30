package core.companies.bny.one;

public class Employee {

	private int id;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return String.valueOf(id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return emp.id == this.id;
		}
		return false;
	}

}
