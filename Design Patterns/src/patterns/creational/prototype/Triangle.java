package patterns.creational.prototype;

public class Triangle extends Shape {

	public Triangle() {
		// TODO Auto-generated constructor stub
		this.setType("Triangle");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Drawn");
	}
}
