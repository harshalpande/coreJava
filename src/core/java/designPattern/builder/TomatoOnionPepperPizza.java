package core.java.designPattern.builder;

public class TomatoOnionPepperPizza extends VegPizza {

	@Override
	public String name() {
		return "Tomato, Onion and Pepper";
	}

	@Override
	public float price() {
		return 120;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "LARGE";
	}

}
