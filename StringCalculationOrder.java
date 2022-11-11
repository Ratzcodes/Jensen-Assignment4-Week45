package Week45;

public class StringCalculationOrder {

	public static void main(String[] args) {
		 
		  System.out.println(5+3+"xyz"+3+5);
			System.out.println(5*3+"xyz"+3*5);
			System.out.println(5*3+"xyz"+(3+5));
			System.out.println(3+5+6*1);
			
			System.out.println("xyz"+3+5);
			System.out.println("xyz"+(3+5));
			System.out.println(5+3+"xyz");
			
			String name = "rafael";
			System.out.println(name.compareToIgnoreCase("rafael"));
			System.out.println(name.compareTo(name));
			
			String sentence = "     Hello     Helloooooo    ";
			System.out.println(sentence);
			System.out.println(sentence.trim());
			
			String str1 = new String("Hello");
		    String str2 = new String("Hello");
		    System.out.println(str1==str2);
		    System.out.println(str1.equals(str2));
		    
		    String studyEscape = new String();
		    studyEscape= " \'Hello\' ";
		    System.out.println(studyEscape);
	}

}
