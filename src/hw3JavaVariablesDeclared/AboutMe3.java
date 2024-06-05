package hw3JavaVariablesDeclared;

public class AboutMe3 {
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
	public AboutMe3() {
		System.out.println("I am the constractor of AboutMe3 class");
	}

	// Method implement
	public void aboutMe() {
		System.out.println(
				"\tMy name:" + myName + "\n\tMy Age:" + myAge + "\n\tMy Apt:" + myApt + "\n\tMy salary:" + mySalary);
	}

}
