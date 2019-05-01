package core.java.designPattern.abstractfactory.abstractfactory2;

public class DimensionFactory {

	public AbstractDimension getDimension(DimensionType dimensionType) {
		if (DimensionType.TWO_D.equals(dimensionType)) {
			return new TwoDimension();
		}
		if (DimensionType.THREE_D.equals(dimensionType)) {
			return new ThreeDimension();
		}
		return null;
	}

}
