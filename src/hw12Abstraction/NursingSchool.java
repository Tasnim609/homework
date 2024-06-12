package hw12Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{

	//abstract method
	public abstract void hygenic();

	//non abstract method
	public void caring() {
		System.out.println("Thia non abstract method of NarsingSchool class");
	}
}
