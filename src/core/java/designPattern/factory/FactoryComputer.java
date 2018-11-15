package core.java.designPattern.factory;

public class FactoryComputer {
	
	public static ComputerAbstract getComputer(String type, String ram, String cpu, String hdd) {
		
		if (type.equalsIgnoreCase("PC")) {
			return new PCComputer(ram, cpu, hdd);
		}
		if (type.equalsIgnoreCase("SERVER")) {
			return new PCComputer(ram, cpu, hdd);
		}
		return null;
	}

}
