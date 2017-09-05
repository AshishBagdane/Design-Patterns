package patterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		} else {
			return null;
		}
	}

}
