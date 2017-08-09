package patterns.behavioral.strategy;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}
	
	public int executeStrategy(int number1, int number2) {
		return strategy.doOperation(number1, number2);
	}
}
