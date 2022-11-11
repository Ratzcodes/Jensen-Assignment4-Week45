package Week45;

import java.util.Scanner;

public class Dice_Main {

	/*
	 * 1. Has a main method. 
	 * You should instantiate an object Game within it 
	 * and also call the method runGame() in order to play the game.
	 */
	public static void main(String[] args)  {
		Scanner in  = new Scanner(System.in);
		System.out.println("Welcome to the Dice Game." +"\n" + "Press Enter key to Start the game.");
		in.nextLine();
		Dice_Game run = new Dice_Game();
		run.runGame();
		in.close();
	 }
}
