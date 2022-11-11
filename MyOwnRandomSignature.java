package Week45;

import java.util.Random;

public class MyOwnRandomSignature {
	
	public static void main(String args[]) {
		
		MyOwnRandomSignature myNumber =new MyOwnRandomSignature();
		
		System.out.println("Random generated number between 3 and 6.");
		for ( int i= 0; i <10; i++) {
			myNumber.getRandomBetweenNumbers(3, 6);
		}
		System.out.println("");
		
		System.out.println("Random generated number between 10 and 50.");
		for ( int i= 0; i <10; i++) {
			myNumber.getRandomBetweenNumbers(10,50);
		}
		
	}
		
	public int getRandomBetweenNumbers(int minValue, int maxValue) {
		Random random = new Random();
		int randomInteger = random.nextInt(minValue, maxValue);
		System.out.print(randomInteger+" ");
		return randomInteger;
	}
	

}
