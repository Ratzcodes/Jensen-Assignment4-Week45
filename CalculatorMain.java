package Week45;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the two numbers to perform the operations on: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int num3 = 100;
		
		Calculator cal = new Calculator(num1,num2);
		System.out.println("Sum of " +num1 + " and "+ num2+ " is: " +cal.addition2());
		System.out.println("Difference of " +num1 + " and "+ num2+ " is: " + cal.subtraction());
		System.out.println("Product of " +num1 + " and "+ num2+ " is: " +cal.multiplication());
		System.out.println("Quotient of " +num1 + " and "+ num2+ " is: " +cal.division());

		
		Calculator cal1 = new Calculator(num1, num2, num3);
		System.out.println("Sum of " +num1+ " , "+ num2+ " and "+num3+ " is: " +cal1.addition3());
		in.close();
	}

}
