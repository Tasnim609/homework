package hw13_If_ElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age = 21;
		if (age == 18) {
			System.out.println("I am voter");
		} else if (age < 18) {
			System.out.println("i am not a voter");
		} else if (age > 18) {
			System.out.println("i am a voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}
	}

}
