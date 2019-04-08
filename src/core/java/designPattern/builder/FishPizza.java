package core.java.designPattern.builder;

public class FishPizza extends NonVegPizza{

	@Override
	public String name() {
		return "FISH Pizza";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 330;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "MEDIUM";
	}

}
