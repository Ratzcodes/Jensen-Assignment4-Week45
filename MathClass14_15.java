package Week45;

import java.util.Scanner;

public class MathClass14_15 {

	public static void main(String[] args) {
		/*
		 * 14. Create a java program. 
		 * Your program should print the result of the conversion of a given value in degrees 
		 * to radians. (Hint: use Math.toRadians() )
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value in degrees: ");
		int valueInDegrees = in.nextInt();
		
		double valueInRadians = Math.toRadians(valueInDegrees);
		System.out.println("Value of "+valueInDegrees+ " in radians is:" +valueInRadians);
		
		/*
		 * 15. Create a java program. 
		 * Your program should print the result of the conversion of a given value in radians 
		 * to degrees. (Hint: use Math.toDegrees() )
		 */
		System.out.println("Enter the value in radians: ");
		double valueRadians = in.nextInt();
		
		double valueDegree = Math.toDegrees(valueRadians);
		System.out.println("Value of "+valueRadians+ " in degrees is: " + valueDegree );
		
		in.close();
	}

}
