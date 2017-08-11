package patterns.creational.prototype;

import java.util.HashMap;

public class ShapeCache {

	private static HashMap<Integer, Shape> shapeMap = new HashMap<>();
	
	public static Shape getShape(int shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape;
	}
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId(1);
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId(2);
		shapeMap.put(rectangle.getId(), rectangle);
		
		Triangle triangle = new Triangle();
		triangle.setId(3);
		shapeMap.put(triangle.getId(), triangle);
	}
}
