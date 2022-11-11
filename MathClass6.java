package Week45;

import java.util.Random;

/*
 * Create a java program with a do-while loop. 
 * The program should iterate 10 times and 
 * print a randomly generated integers numbers between 0 and 10. Use the class Random.
 * 
 */

public class MathClass6 {

	public static void main(String[] args) {
		// create a Random class object
		Random rand = new Random(10);
		
		System.out.println("10 Random integer numbers generated between 0 and 10 are");
		int i = 0;
		do {
			System.out.println(rand.nextInt(10));
			i++;
		}while ( i <10);
		

	}

}
