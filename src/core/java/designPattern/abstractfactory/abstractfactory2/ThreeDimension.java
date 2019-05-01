package core.java.designPattern.abstractfactory.abstractfactory2;

public class ThreeDimension extends AbstractDimension {

	@Override
	public IGeometricShape getShape(ShapeType shapeType) {
		if (ShapeType.SPHERE.equals(shapeType)) {
			return new Sphere();
		}
		return null;
	}

}
