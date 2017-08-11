package patterns.creational.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.setType("Rectangle");
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Drawn");
	}

}
