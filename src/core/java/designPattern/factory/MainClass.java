package core.java.designPattern.factory;

public class MainClass {

	public static void main(String[] args) {
		ComputerAbstract pc = FactoryComputer.getComputer("pc", "256mb", "p4", "80");
		ComputerAbstract server = FactoryComputer.getComputer("server", "1TB", "i10", "1024TB");
		System.out.println(pc);
		System.out.println(server);
	}
}
