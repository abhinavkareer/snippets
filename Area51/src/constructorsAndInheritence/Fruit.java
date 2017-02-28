package constructorsAndInheritence;

public class Fruit {

	public Fruit(){
		System.out.println("Default constructor of Fruit called!");
	}
	
	public Fruit(String param){
		System.out.printf("Parameterized constructor of Fruit called with param:%s",param);
	}
	
	public void eat()
	{
		System.out.println("Eat method from Fruit");
	}
	
}
