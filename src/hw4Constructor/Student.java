package hw4Constructor;

public class Student {
	// Variable declare / define
	public String stName;
	public int stId;
	public char stGender;
	public boolean isProgrammer;
	public float stGrade;
	public double myStudentLoan;
	public byte myMonthlyPayment;
	public short myExpendature;

	// constructor declared or define and also called default constructor
	public Student() {
		System.out.println(" I am the constructor of Student class");
	}

//[1 ] Parameterize constructor declare=we pass 4 parameter
	public Student(String stName, int stId, char stGender, boolean isProgrammer) {
		super();// We will not work with Supper class
		this.stName = stName;
		this.stId = stId;
		this.stGender = stGender;
		this.isProgrammer = isProgrammer;
		System.out.println("Student name: " + stName + ", Student Id: " + stId + ", Student gender: " + stGender
				+ ", Student programmeer: " + isProgrammer);
	}

	// [2] parameterize constructor declare= we pass 3 parameter
	public Student(String stName, int stId, char stGender) {
		super();
		this.stName = stName;
		this.stId = stId;
		this.stGender = stGender;
		System.out.println(", Student name: " + stName + ", Student Id: " + stId + ", Student gender: " + stGender
				+ ", Student programmer: " + isProgrammer);

	}

	/// [3] parameterize constructor declare= we pass 4 parameter
	// parameter and argument will be same but syso can be different ,like below
	public Student(String stName, int stId, char stGender, boolean isProgrammer, float stGrade) {
		super();
		this.stName = stName;
		this.stId = stId;
		this.stGender = stGender;
		this.isProgrammer = isProgrammer;
		this.stGrade = stGrade;
		System.out.println(",  Student Id: " + stId + " Student name: " + stName + ",  Student gender: " + stGender
				+ ",  Student programmeer: " + isProgrammer + ", Student grade: " + stGrade);
	}

	// we can change Parameter name from variable name
	public Student(String name, int studentId) {
		this.stName = name;
		this.stId = studentId;
		System.out.println(",  Student Id: " + studentId + ", Student name: " + name);
	}

}
