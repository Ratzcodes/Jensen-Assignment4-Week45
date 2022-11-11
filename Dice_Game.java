package Week45;

import java.util.Scanner;

public class Dice_Game {
		
	private String firstPlayer, secondPlayer;	// 1. Has firstPlayer and secondPlayer as attributes.
	
	/*
	 * 2. Has a method requestPlayerNames() that asks the users to enter their names 
	 * and creates two players with the given names.
	 */
	public void requestPlayerNames() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the first player: ");
		this.firstPlayer = in.nextLine();
		System.out.println("Enter the name of the second player: ");
		this.secondPlayer = in.nextLine();
		in.close();
		
		System.out.println("Each player throws the dice three times.\n");
	}

	/*
	 * 3. Has a method requestPlayerThrows() with a player as parameter. 
	 * Each player should throw the dice three times. 
	 * The method requires the user to press a key for throwing the dice at each new throw. 
	 * The method should return a Player with updated values of the attribute totalOfPoints 
	 * and the attribute name should be the set as the name of the Player object 
	 * that was used as a parameter for the method.
	 */
	public void requestPlayerThrows(String player) {
		Scanner enterKey = new Scanner(System.in);
		
		System.out.println("***********************"+player+"*********************** \n");
		
		Dice_Player playerPoints = new Dice_Player(player);
		
		for(int i=1; i <=3; i++) {
		System.out.println(player+ "," + " Please press ENTER to throw the dice...");
		enterKey.nextLine();
		/*The method requires the user to press a key for throwing the dice at each new throw.*/
		/*feature unimplemented here*/
		
		Dice_Dice d1 = new Dice_Dice(0);
		d1.throwDice();
		System.out.println(player + ", You got: "+ d1.getValue());
		
		playerPoints.setTotalPoints(d1.getValue());
		}
		System.out.println(player + ",  that was your last throw!!. Your total points are: " + playerPoints.getTotalPoints() + "\n");
		
		enterKey.close();
	}
	
	
	/*
	 * 4. Has a method comparePointsOfPlayers() where it takes two parameters; firstPlayer and secondPlayer. 
	 * The method compares which player has a higher value in the attribute totalOfPoints 
	 * and decides who won or eventually if it was a draw.
	 */
	public void comparePointsOfPlayers(String firstPlayer2, String secondPlayer2) {
		
		
	}
	
	/*
	 * 5. Has a method runGame() that will be called by the main class. 
	 * The method should call the method requestPlayerNames(), 
	 * and request the method requestPlayerThrows() for both the firstPlayer
		and the secondPlayer. 
		Finally, the method should call the method comparePointsOfPlayers() and decide who won.
	 */
	public void runGame() {
		requestPlayerNames();
		requestPlayerThrows(firstPlayer);
		requestPlayerThrows(secondPlayer);
		comparePointsOfPlayers(firstPlayer,secondPlayer);
	}
	

}


//System.out.printf("User Score: %d\n Cpu Score: %d\n", userScore, cpuScore);

/*Scanner in = new Scanner(System.in);
			in.nextLine();
			*/
			
		/*	try {
				System.in.read();
				in.nextLine();
				//int value1 = Integer.parseInt(in.nextLine()); 
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/