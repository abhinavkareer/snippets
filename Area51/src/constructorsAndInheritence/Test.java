package constructorsAndInheritence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit myFruit=new Fruit("yo");
		Fruit myApple=new Apple();
		
		myFruit.eat();
		myApple.eat();
//		myApple.hasSeeds();
		
	}

}
