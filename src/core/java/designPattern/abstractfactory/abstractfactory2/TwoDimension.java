package core.java.designPattern.abstractfactory.abstractfactory2;

public class TwoDimension extends AbstractDimension {

	@Override
	public IGeometricShape getShape(ShapeType shapeType) {
		if (ShapeType.LINE.equals(shapeType)) {
			return new Line();
		}
		if (ShapeType.CIRCLE.equals(shapeType)) {
			return new Circle();
		}
		return null;
	}

}
