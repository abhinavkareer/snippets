package constructorsAndInheritence;

public class Apple extends Fruit {
	public Apple() {
		System.out.println("Default constructor of Apple called!");
	}

	public Apple(String param) {
		System.out.printf("Parameterized constructor of Apple called with param: %s \n", param);
	}

	public void eat() {
		System.out.println("Eat method from Apple");
	}
	
	public void hasSeeds() {
		System.out.println("True");
	}
	
	

	protected void finalize() {

		System.out.println("Destroying apple Object");
	}

}
