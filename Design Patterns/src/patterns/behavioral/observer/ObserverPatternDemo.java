package patterns.behavioral.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexObserver(subject);
		
		System.out.println("First state change: " + 15);
		subject.setState(15);
		System.out.println("Second state change: " + 25);
		subject.setState(25);
	}
}
