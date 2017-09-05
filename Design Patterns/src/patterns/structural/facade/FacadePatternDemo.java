package patterns.structural.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker maker = new ShapeMaker();
		
		maker.drawCircle();
		maker.drawRectangle();
		maker.drawTriangle();
	}

}
