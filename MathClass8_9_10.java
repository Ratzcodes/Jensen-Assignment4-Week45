package Week45;

import java.util.Scanner;

public class MathClass8_9_10 {
/*
 *  8: Create a java program in which you instantiate a double value 10.0 
 * and prints the division of the value of the variable by 0.84 
 * and also the rounded value of this variable divided by 0.84. (Hint: use the method Math.round())
 */
	public static void main(String[] args) {
		double num1 = 10.0;
		double result;
		
		result = num1/0.84;
		System.out.println(result);
		
		//rounded value
		System.out.println(Math.round(result));
		
/********************************************************************/
		/*
		 * 9: Create a java program in which you instantiate an integer variable called exponent. 
 * The program should print the value of 2𝑛, where n is the exponent. (Hint: use Math.pow())
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of the exponent: ");
		int n = in.nextInt();  // exponent value
		
		System.out.println("Value of 2 to the power of "+n+ " is: "+ Math.pow(2,n));
		
/*********************************************************************/
		
		/* 10: Create a java program where you calculate the area of a circle. 
		 * Your program should instantiate a double variable called radius and 
		 * then print the area of the circle. 
		 * (Hint1: The formula to calculate the area of a circle is: 𝐴=𝜋.𝑟2 . 
		 * Hint2: Use Math.PI. Hint3: Use Math.pow())
		 */
		
		System.out.println("Enter the radius of the circle: ");
		double radius = in.nextDouble();
		
		System.out.println("Area of the circle is: " + Math.PI *(Math.pow(radius,2)));
		
		in.close();
	}

	
	
}
