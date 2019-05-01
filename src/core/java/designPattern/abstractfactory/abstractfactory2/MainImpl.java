package core.java.designPattern.abstractfactory.abstractfactory2;

public class MainImpl {

	public static void main(String[] args) {
		DimensionFactory dimensionFactory = new DimensionFactory();
		AbstractDimension dimension = dimensionFactory.getDimension(DimensionType.TWO_D);

		IGeometricShape shape = dimension.getShape(ShapeType.CIRCLE);
		if (shape == null) {
			System.out.println("This geometric shape can't be printed");
		} else
			shape.draw();
	}

}
