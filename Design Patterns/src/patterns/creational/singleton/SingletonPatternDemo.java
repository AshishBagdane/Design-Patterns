package patterns.creational.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
	}
}
