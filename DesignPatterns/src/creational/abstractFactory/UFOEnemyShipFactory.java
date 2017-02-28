package creational.abstractFactory;

public class UFOEnemyShipFactory implements EnemyShipFactory{

	// Defines the weapon object to associate with the ship
	
	public ESWeapon addESGun() {
		return new ESUFOGun(); // Specific to regular UFO
	}

	// Defines the engine object to associate with the ship
	
	public ESEngine addESEngine() {
		return new ESUFOEngine(); // Specific to regular UFO
	}
}
