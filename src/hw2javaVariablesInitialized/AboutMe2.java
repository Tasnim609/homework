package hw2javaVariablesInitialized;

public class AboutMe2 {
//
	// Variable Declare
	public String myNameString;
	// Variable Declare
	public String myName = "Tasnim";
	public byte myAge = 100;
	public short myApt = 609;
	public int mySalary = 3000;
	public long myBankBalance = 45678999l;
	public float myHight = 5.3f;
	public double myGrade = 5.3;

	// Constructor Declared
	public AboutMe2() {
		System.out.println("I am the constractor of AboutMe2 class");
	}

	// Method implement
	public void aboutMe() {
		System.out.println("I am the method of aboutMe ");
	}

	public void city_bus() {
		System.out.println("I am the method of city_bus");
	}
    // main method
	public static void main(String[] args) {
		AboutMe2 tasnim = new AboutMe2();// Constructor Initialized
		System.out.println("\tMy name: " + tasnim.myName+ "\n\t My age: " + tasnim.myAge + "\n\tMyApt: " + tasnim.myApt
				+ "\n\t MySalary: " + tasnim.mySalary + "\n\t MyBankBalance: " + tasnim.myBankBalance);
		// We can call method by object
		tasnim.aboutMe();
		tasnim.city_bus();
	}
}
