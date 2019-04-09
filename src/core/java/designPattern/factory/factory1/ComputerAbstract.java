package core.java.designPattern.factory.factory1;

public abstract class ComputerAbstract {

	public abstract String getRam();

	public abstract String getCpu();

	public abstract String getHDD();

	@Override
	public String toString() {
		return "RAM = " + this.getRam() + ", HDD =" + this.getHDD() + ", CPU =" + this.getCpu();
	}
}
