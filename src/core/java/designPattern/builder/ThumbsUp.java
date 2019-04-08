package core.java.designPattern.builder;

public class ThumbsUp extends ColdDrink{

	@Override
	public String name() {
		return "Thumbs Up";
	}

	@Override
	public String size() {
		return "MEDIUM";
	}

	@Override
	public float price() {
		return 120;
	}

}
