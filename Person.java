package Week45;

public class Person {
	// set attributes
	private String name, gender, nationality;
	private int age;
	
	// constructor method : is used to set the attributes of the person
	public Person(String name,int age, String gender, String nationality) {
		this.name = name;
		this.age = age;
		this.gender= gender;
		this.nationality = nationality;
		
	}
	
	// setter methods for all attributes
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	// getter methods for all attributes
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getNationality() {
		return nationality;
	}
	
/*	// main method / Driver method
	public static void main(String args[]) {
		Person myPerson1 = new Person("Josephina", 33, "Female", "American");
		System.out.println("My name is " +myPerson1.name +"." +" I am " + myPerson1.age+" years old " + myPerson1.gender + " and I am " + myPerson1.nationality);
		
		Person myPerson2 = new Person("Mohan", 35, "Male", "Indian");
		System.out.println("My name is " +myPerson2.name +"." +" I am " + myPerson2.age+" years old " + myPerson2.gender + " and I am " + myPerson2.nationality);
	}
	
	*/

}
