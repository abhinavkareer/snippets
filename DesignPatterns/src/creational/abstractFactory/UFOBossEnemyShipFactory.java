package creational.abstractFactory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{

	// Defines the weapon object to associate with the ship
	
	public ESWeapon addESGun() {
		return new ESUFOBossGun(); // Specific to Boss UFO
	}

	// Defines the engine object to associate with the ship
	
	public ESEngine addESEngine() {
		return new ESUFOBossEngine(); // Specific to Boss UFO
	}

}