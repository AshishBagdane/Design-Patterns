package patterns.creational.abstractfactory;

public abstract class AbstractFactory {

	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);
}
