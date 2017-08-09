package patterns.behavioral.strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context addition = new Context(new Addition());
		System.out.println("Addition: " + addition.executeStrategy(10, 20));
		
		Context subtraction = new Context(new Subtraction());
		System.out.println("Subtraction: " + subtraction.executeStrategy(10, 20));
		
		Context multiplication = new Context(new Multiplication());
		System.out.println("Multiplication: " + multiplication.executeStrategy(10, 20));
	}
}
