package patterns.creational.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		} else if (factory.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		} else {
			return null;
		}
	}
}
