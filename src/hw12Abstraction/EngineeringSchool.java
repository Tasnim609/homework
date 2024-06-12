package hw12Abstraction;

public abstract class EngineeringSchool extends NYUniversity{

	//abstract method
	public abstract void macanicalLab();

	//non abstract method
	public void computerLab() {
		System.out.println("This is non abstract method of EngineeringSchool");
	}
}
