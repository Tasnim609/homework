package hw5JavaMethod;

public class MyFamily {

	// Global variable
	// Variable initialize
	public int child1Age = 10;
	public int child2Age = 12;
	public int child3Age = 13;

	// return type method
	public int myFamily() {
		// total= local variable because it is inside the method
		int total = child1Age + child2Age + child3Age;
		System.out.println("The sum of my children age is : " + total);
		return 0;
	}

	public static void main(String[] args) {
		// Class instantiated by creating object
		MyFamily mF = new MyFamily();
		mF.myFamily();
	}

}
