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
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygenic() {
		// TODO Auto-generated method stub
		
	}
}



