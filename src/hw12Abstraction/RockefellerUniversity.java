package hw12Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AronaticalSchool{
	//method implement
	public void maths() {
		System.out.println("This is the non abstract method of RockefelellerUnicersity class");
	}

	@Override
	public void macanicalLab() {
System.out.println("this is macanicallab method from EngineeringSchool class");		
	}

	@Override
	public void aronaticalInfo() {
System.out.println("this is aronaticalInfo method from AronaticalSchool class");		
	}
}
