package hw5JavaMethod;

public class FullName {
	// return type parameterized method and pass the parameter
	public String fullName(String fName, String lName) {
		String totalFN = fName + " " + lName;
		System.out.println("Family member: " + totalFN);
		return totalFN;
	}

	public static void main(String[] args) {
		// Class instantiated by creating object
		// we can call the method by object and pass argument
		FullName fN = new FullName();
		fN.fullName("Tasnim", "Chowdhury");
		fN.fullName("Tamim", "Qurashy");
		fN.fullName("Darime", "Qurashy");
		fN.fullName("Dawsi", "Qurashy");
		fN.fullName("Marnia", "Qurashy");

	}

}
