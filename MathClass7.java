package Week45;

import java.util.Random;

/*
 * Create a java program that has a for loop of 10 iterations. 
 * The program should have a variable sum and every time a new iteration is performed, 
 * a random value, between 0 and 10, will be generated, 
 * printed and added to the existing value stored in the variable sum. 
 * In the end, you should print the total sum and the average value of the values.
 * 
 */

public class MathClass7 {

	public static void main(String[] args) {
		Random rand = new Random(10);
		int sum =0;
		
		//random numbers between 0-10 generation, iterate for 10 times
		for ( int i=0; i <10; i++) {
			System.out.println(rand.nextInt(10));
			//int storeRand = rand.nextInt(10);
			sum += rand.nextInt(10);
			
			
		}
		System.out.println("Sum of all Random numbers is : "+ sum);
		System.out.println("Average is: " + sum/10);

	}

}
