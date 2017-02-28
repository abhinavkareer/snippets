package creational.abstractFactory;

public class EnemyShipTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EnemyShipBuilding handles orders for new EnemyShips
		// You send it a code using the orderTheShip method &
		// it sends the order to the right factory for creation
			
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
 
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
	}

}
