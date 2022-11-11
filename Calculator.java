package Week45;

public class Calculator {

	// declare the attributes
	private int num1 , num2, num3;
	private int sum =0;
	private int sub =0;
	private int mul =0;
	private int div =0;
	
	//create a Constructor to set the attributes
	public Calculator( int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// another constructor
	public Calculator( int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	// other functions / methods follow
	public int addition2() {
		return sum = num1 + num2;
	}
	
	public int addition3() {
		return sum = num1 + num2 + num3;
	}
	
	public int subtraction() {
		return sub = num1-num2;
	}
	
	public int multiplication() {
		return mul = num1 * num2;
	}
	
	public int division() {
		return div = num1/num2;
	}
	
	
}
