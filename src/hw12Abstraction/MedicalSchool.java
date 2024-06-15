package hw12Abstraction;





public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	//abstract class or regular class can not inherit more then one regular or abstract class
	//only one regular or abstract class we can inherit by extends keywords
//abstract class or regular class can inherit more than one interface by implements keyword
	
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
	public  void biochemistryLab() {
		System.out.println("This is non abstract method of Medical class");
	}
}



