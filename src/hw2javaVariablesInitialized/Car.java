package hw2javaVariablesInitialized;

//important about \t  =it will be 1 tab ,\n = 1 new line will create,  \n\t =new line and tab will create 
//shift+control/command+F=organize the code,   it call (Indentation).
public class Car {
	// variable declared
	String name;
	// variable initialize
	int age = 50;
	float mygpa = 3.4f;
	boolean IamStudent = true;
//String is not a pure primitive data type,String is a class and represents for string type variable here 
	String myEducation = "mastarce";
	char mygender = 'F';
	double myLoan = 456778999;// 9 digits
	double myCoumputerPrice = 456.74;
	short carPrice = 3566;
	byte rollNumber = 127;

	public Car() {
		// constructor declared
		System.out.println("I am the Car of constractor," + "  " + "I am the default constructor.");
	}

	public static void main(String[] args) {
		// constructor initialized
		Car key = new Car();
		System.out.println(
				"\tMy age:  " + key.age + "\n\tmy GP:  " + key.mygpa + "\nI am the student:  " + key.IamStudent);

	}

}