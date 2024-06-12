package hw9Abstraction;

public abstract class NursingSchool implements LawSchool{

	//abstract method
	public abstract void hygenic();

	//non abstract method
	public void caring() {
		System.out.println("Thia non abstract method of NarsingSchool class");
	}
}
