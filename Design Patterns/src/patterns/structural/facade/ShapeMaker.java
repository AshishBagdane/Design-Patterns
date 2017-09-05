package patterns.structural.facade;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	public ShapeMaker() {
		// TODO Auto-generated constructor stub
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
}
