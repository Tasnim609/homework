package hw9Abstraction;



public interface University extends College,Hospital{
//we can not inheritance abstract or regular class by interface , it is not allow.
	//we can inherit more than one interface by extends keyword in the interface.
	// i see that variable declare is not allow. Only variable initialize ,we can do.

	public int age = 4;
	// we can not write (Constructor) in the interface class,it is not allow
	// also we can not write (method implement)in the interface

	// In the interface all method will be declare
	// method declare/define
	// all are abstract method
	public void classSize();

	public void playGround();

	public void teacher();
	
	public void gymnasium();
	
	public void dorm();
	
	public static void  studyRoom() {
		System.out.println("static type void method of College interface");
	}
	public static void library() {
		System.out.println("static type void implement in the University interface");
		
	}

}








