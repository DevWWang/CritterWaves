
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args){

		int levelNumber = 1;
		CritterGenerator critterGenerator;
		System.out.println("Type 'start' to Start the wave");
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String answer = input.next();
			if (answer.equals("start")){
				critterGenerator = new CritterGenerator(levelNumber);
			}
			else if (answer.equals("y")){
				levelNumber++;
				System.out.println("Wave Level: " + levelNumber);
				critterGenerator = new CritterGenerator(levelNumber);
			}
			else {
				System.out.println("No more Wave is coming!");
				break;
			}
			System.out.println("\nNext Wave? y/n");
		}
	}
}
