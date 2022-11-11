package Week45;

/* 
 * Create a java program in which you instantiate two Strings and 
 * the program prints if they are equal or not. 
 * 2: In this case, you should consider lower and upper case. 
 * (Hint: Use the method equals() )
 * 
 * 3: In this case, you should ignore lower and upper case. 
 * (Hint: use the method equalsIgnoreCase() )
 */
public class StringProgram2_3 {

	public static void main(String[] args) {
		String str1 = new String("Hello to Java World");
		String str2 = new String("Hi there Wecome to Java Programming");
		String str3 = new String("Hello to Java World");
		String str4 = new String("HELLO TO JAVA WORLD");
		
		System.out.println(str1.equals(str2));  // false
		System.out.println(str1.equals(str3));  //true
		
		System.out.println(str1.equalsIgnoreCase(str4)); // HELLO TO JAVA WORLD
		
		
	}

}
