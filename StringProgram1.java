package Week45;

import java.util.Scanner;

/* 
 * Create a java program that requests a name from the user and prints its length. 
 * (Hint: use the method length() ).
 */
public class StringProgram1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter you name: ");
		String name = in.nextLine();
		
		System.out.println("Length of the name " +name +" is: " + name.length());
		in.close();
	}

}
