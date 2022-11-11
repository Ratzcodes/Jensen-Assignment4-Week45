package Week45;

public class Dice_Player {

	private String name; 	// 1. Has an attribute name that stores the name of a player.
	private int totalPoints=0; //2. Has an attribute totalPoints that stores the sum of the points of a player.
	
	/*
	 * 3. Create getters and setters methods for the attributes 
	 * and a constructor method that requires a string name to be used as the name of the player.
	 */
	public Dice_Player(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setTotalPoints( int points) {
		this.totalPoints = this.totalPoints + points;
	}

	public int getTotalPoints() {
		return this.totalPoints;
	}
	
	
}
