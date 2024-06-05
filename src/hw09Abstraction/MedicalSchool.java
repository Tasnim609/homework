package hw09Abstraction;

public abstract class MedicalSchool extends NursingSchool{
//abstract class can inherit one abstract class or one regular class by extends keyword
	//By extends keyword we cannot inherit interface.
	// I see that Variable declare and variable initialized are allow in abstract
	// class
	public int age;
	public String name = "Tasnim";

	// Default Constructor is allow in abstract class
	public MedicalSchool() {
		System.out.println("This is the default constractur of MedicalSchool of abstract class");
	}

	// abstractor method and Non abstract method are allow in abstract class
	public abstract void anatomyLab();

	//non abstract method
	public void biochemistryLab() {
		System.out.println("This is non abstract method of Medical class");
	}
}



