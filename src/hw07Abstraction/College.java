package hw07Abstraction;

public interface College {
	public abstract void commonRoom();

	public abstract void laboratory();

	public abstract void languageClub();
	
	//abstract method / default method
	public void dorm();
	
	//non abstract method / implement method 
	public static void studyRoom() {
		System.out.println("This is studyRoom method of College class");
	}
}
