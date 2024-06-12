package hw07Abstraction;

import javax.swing.DefaultBoundedRangeModel;

public interface Hospital {
	// if we want ,we can write the (abstract word) in the method declare
		// we can write abstract word or we can't write ,as we wish .both will be good
		public abstract void emergencyRoom();

		//abstract method
		public void surgeryRoom();

		//abstract method
		public void cafeteria();
		
		//abstract method 
		public void morgue();
		
		//non abstract  static Type method
		public static void pharmacy() {
			System.out.println("This is static non abstract method of Hospital class");
		}
		//non static default type implemented method
		public default void waitingRoom() {
			System.out.println("This is non abstract waitingRoom method of Hospital class");
		}
		
}
