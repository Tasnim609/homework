package hw10UseOfSuperINChildClass;

public class Father {

	String name;
	int age;
	char sex;
	boolean usCitizen;
	String familtName;
	
	public Father() {
		System.out.println("This is default constractor of Father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("The nameis: "+name+", The age is :  "+age+", The sex is : " +sex+", The citizen is: "+usCitizen);
		
		System.out.println("..................................................");
	}
	
	public void father() {
		System.out.println("This is void type method of Father class");
}
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		
		System.out.println("The nameis: "+name+"\n The age is : "+age+"\nThe sex is : " +sex+"\nThe citizen is: "+usCitizen);
	}
}