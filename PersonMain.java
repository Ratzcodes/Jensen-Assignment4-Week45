package Week45;

public class PersonMain {

	public static void main(String args[]) {
		
		Person myPerson1 = new Person("",0 , "", "");
		myPerson1.setName("Josh");
		myPerson1.setAge(45);
		myPerson1.setGender("Male");
		myPerson1.setNationality("Serbian");
		System.out.println("My name is " +myPerson1.getName() +"." +" I am " + myPerson1.getAge()+" years old " + myPerson1.getGender() + " and I am " + myPerson1.getNationality());
		
		Person myPerson2 = new Person("", 0, "", "");
		myPerson2.setName("Geeta");
		myPerson2.setAge(22);
		myPerson2.setGender("Female");
		myPerson2.setNationality("Canadian");
		System.out.println("My name is " +myPerson2.getName() +"." +" I am " + myPerson2.getAge()+" years old " + myPerson2.getGender() + " and I am " + myPerson2.getNationality());
	}
	
}
