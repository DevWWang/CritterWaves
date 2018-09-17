import java.util.ArrayList;
import java.util.Random;


public class CritterGenerator {
	
	/**
	 * Generate critters randomly (both type and amount)
	 * 
	 * @param levelNumber the number of current number
	 */
	public CritterGenerator(int levelNumber){
		ArrayList<Critter> critterWave = new ArrayList<Critter>();
		
		int numberOfCritters = randomNumber(levelNumber);
		for (int i = 0 ; i < numberOfCritters; i++){
			critterWave.add(critterRandomSelection());
		}
	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	public static CritterType getType(int type){
		switch(type){
		case 0:
			return CritterType.REGULAR;
		case 1: 
			return CritterType.ARMORED;
		case 2:
			return CritterType.BOSS;
		default:
			return CritterType.TANK;
		}
	}
	
	/**
	 * 
	 * @param number
	 * @return random number of critters
	 */
	public static int randomNumber(int number){
		int randomNumber = 1;

		if (number < 25){
			randomNumber = new Random().nextInt(3) + number + randomNumber;
		}
		else {
			randomNumber = new Random().nextInt(3) + 30;
		}
		return randomNumber;
	}
	
	/**
	 * 
	 * @return critter selected randomly
	 */
	public static Critter critterRandomSelection(){
		Random randomGenerator = new Random();
		int critterType = randomGenerator.nextInt(4);
		CritterType c = getType(critterType);
		Critter myCritter = CritterFactory.createCritter(c);
		System.out.println(myCritter);
		
		return myCritter;
	}
}
