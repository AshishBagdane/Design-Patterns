package patterns.creational.prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape(1);
		System.out.println(clonedShape.getType());
		
		clonedShape = ShapeCache.getShape(2);
		System.out.println(clonedShape.getType());
		
		clonedShape = ShapeCache.getShape(3);
		System.out.println(clonedShape.getType());
	}
}