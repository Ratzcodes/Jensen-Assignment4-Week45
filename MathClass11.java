package Week45;

import java.util.Random;

/*
 * 11. Create a java program. 
 * Your program should have an array of integers, a for loop of 30 iterations. 
 * At each iteration store a random integer between 0 and 10 within the array of integers. 
 * Use a for loop for printing the values stored in the array. 
 * Finally, print how many 5 exist within the array.
 */
public class MathClass11 {

	public static void main(String[] args) {
		// Declare and instantiate an object of the Random class.
		Random rand = new Random(10);
		
		// Declare and instantiate an integer array of size 30.
		Integer[] intArray = new Integer[30];
		
		// Iterate the array and invoke the nextInt() method and 
		//store a random integer between 0 and 10 within the array of integers
		for(int i=0; i <30; i++) {
			intArray[i] = rand.nextInt(10);
		}
		
		//Use a for loop for printing the values stored in the array
		System.out.println(" Random numbers stored  in array are: ");
		for ( int i=0; i< 30; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

}
