
public class CritterFactory {
	
	public static Critter createCritter(CritterType type){
		Critter critter = new Critter();
		switch(type){
		
		case REGULAR:
			critter.name = "Normal";
			critter.speed = 10;
			critter.health = 10;
			critter.reward = 40;
			critter.armor = 3;
			break;
			
		case ARMORED:
			critter.name = "Armored";
			critter.speed = 15;
			critter.health = 20;
			critter.reward = 60;
			critter.armor = 8;
			break;
			
		case BOSS:
			critter.name = "Boss";
			critter.speed = 5;
			critter.health = 50;
			critter.reward = 100;
			critter.armor = 10;
			break;
			
		case TANK:
			critter.name = "Tank";
			critter.speed = 8;
			critter.health = 25;
			critter.reward = 80;
			critter.armor = 4;
			break;
			
		default:
			 critter = null;
		}
		
		return critter;
	}
}
