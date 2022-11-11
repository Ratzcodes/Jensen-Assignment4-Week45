package Week45;

import java.util.Random;

public class MathClass16 {

	public static void main(String[] args) {
/*
 * 16. Create a java program. 
 * Within your program, instantiate two integer variables ageUser1 and ageUser2. 
 * After that, generate ages with the class Random between 0 and 50 for the two variables. 
 * Finally, use the method Math.max() 
 * and print which of the users is the oldest in case the ages are different. 
 * If both users got the same age, print instead a message saying that they have the same age.
 */

		int ageUser1, ageUser2;
		
		Random random = new Random();
		
		ageUser1 = random.nextInt(50);
		System.out.println("User1 age is: "+ageUser1);
		ageUser2 = random.nextInt(50);
		System.out.println("User2 age is: "+ageUser2);
		
		
		if(ageUser1==ageUser2) {
			System.out.println("Both users have same age.");
		} else {
			int max = Math.max(ageUser1, ageUser2);
			System.out.println("User with age "+max+ " is the oldest.");
		}
		
		
	}

}
