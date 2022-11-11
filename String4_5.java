package Week45;

/*
 * Create a java program in which you instantiate a String and assign a value to it. 
 * 4: The program should print if the value you assigned to the string ends with “fael” 
 * and print a message saying that. (Hint: use the method endsWith() )
 * 
 * 5: The program should print if the value you assigned to the string starts with “Rafa” 
 * and print a message saying that. (Hint: use the method startsWith() ).
 */
public class String4_5 {

	public static void main(String[] args) {
		String str1 = new String("Hello Rafael");
		String str2 = new String ("Rafael is here");
		
		System.out.println(str1.endsWith("fael"));
		System.out.println(str1.startsWith("fael"));
		
		System.out.println(str2.startsWith("Rafa"));
		System.out.println(str2.endsWith("fael"));
		
		

	}

}
