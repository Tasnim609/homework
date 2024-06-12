package hw07Abstraction;



public interface University extends College,Hospital{
// interface can inherit more than one interface and separate by comma.
//we have to use extends keyword for inherit.
	//interface can not inherit abstract class or regular class
	// i see that variable declare is not allow. Only variable initialize ,but we have to use static and final keyword

	public static final int age = 4;
	// we can not write (Constructor) in the interface class,it is not allow
	// also we can not write (method implement)in the interface

	// In the interface all method will be declare
	// method declare/define
	// all are abstract method
	public void classSize();

	public void playGround();

	public void teacher();
	
	//default method 
	public void gymnasium();
	
	//non abstract static method 
	public static void library() {
		System.out.println("This is non abstract method library of Unervicity class");
	}
	
//non static implemented method 
	public default void readingRoom() {
		System.out.println("This is default type implemented method of University class");
	}
}








