package Week45;

import java.util.Random;

public class Dice_Dice {
	Random rand = new Random();
	
	private int value;	//1.Has an int attribute value that will store the value of a dice when thrown.
	
	// 2. Create getters and setters methods for the attributes and a constructor method.
	public Dice_Dice(int value) {
		this.value = value;
		
		Random rand = new Random();
		this.value = rand.nextInt(1,6);
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	// 3. Create a method called throwDice(), that randomly returns a value from 1 through 6 to represent the throw of a dice.
	public void throwDice() {
		this.value = rand.nextInt(1,6);
		/* 
		 * OR....
		 *  Random random= new Random();
        setValue(random.nextInt(1,6));
        return value;
		 */
	}
	
}
