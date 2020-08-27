package core.java.practice;

import java.io.Serializable;

public class SerializationTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8224907189833310712L;
	
	private String fName;
	private String lName;
	private int age;
	private String address;
	
	static String gender = "male";

	public String getfName() {
		return fName;
	}

	@Override
	public String toString() {
		return "SerializationTest [fName=" + fName + ", lName=" + lName + ", age=" + age + ", address=" + address + "]";
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SerializationTest(String fName, String lName, int age, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
