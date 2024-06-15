package hw12Abstraction;



public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{
	
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
	public void laboratory() {
System.out.println("This is laboratory method from College interface");		
	}

	@Override
	public void languageClub() {
System.out.println("This is languageClub method from College interface");		
	}

	@Override
	public void emergencyRoom() {
System.out.println("This is emergencyRoom method from Hospital inteerface");		
	}

	@Override
	public void surgeryRoom() {
System.out.println("This is surgeryRoom method from Hospital interface");		
	}

	@Override
	public void cafeteria() {
System.out.println("This is cafeteria method from Hospital interface");		
	}

	

	@Override
	public void vocationalInfo() {
System.out.println("this is vocationalInfo method from vocationalSchool interface");		
	}

	@Override
	public void classSize() {
System.out.println("this is classSize method from University interface");		
	}

	@Override
	public void playGround() {
System.out.println("this is playGround method from University interface");		
	}

	@Override
	public void teacher() {
System.out.println("this is teacher method from University interface");		
	}

	@Override
	public void gymnasium() {
System.out.println("this is gymnasium method from University interface");		
	}

	@Override
	public void anatomyLab() {
System.out.println("this is anatomyLab method from MedicalSchool class");		
	}

	@Override
	public void lawInfo() {
System.out.println("this is lawInfo method from LowSchool interface");		
	}

	@Override
	public void hygenic() {
System.out.println("this is hygenic method from Nursing class");		
	}

	@Override
	public void commonRoom() {
System.out.println("this is commonRoom method from College interface");		
	}

	
}



