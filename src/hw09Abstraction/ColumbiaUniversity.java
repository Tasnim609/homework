package hw09Abstraction;



public class ColumbiaUniversity extends MedicalSchool{
	
	//Variable declare
	public int age;
	//variable initialize
	public String name="Tasnim"; 
	
	//default constructor
	public ColumbiaUniversity() {
		System.out.println("This is the constractor of ColumbiaUniversity class");
	}

	// in the regular class (method implement /Non abstract method )
	// abstract method is not allow in regular class
	public void biology() {
		System.out.println("This is the non abstract meothod meothod of ColumbiaUniversity class");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygenic() {
		// TODO Auto-generated method stub
		
	}
}



