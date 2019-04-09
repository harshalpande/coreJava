package core.java.designPattern.factory.factory1;

public class PCComputer extends ComputerAbstract{
	
	private String ram;
	private String cpu;
	private String hdd;
	
	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}
	
	public PCComputer(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

}
