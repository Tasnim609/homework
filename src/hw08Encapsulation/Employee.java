package hw08Encapsulation;

public class Employee {

	//Variable declare
	private String empName;
	private int empAge;
	private char sex;
	private boolean citizen;
	//select all variable , right click , source click ,Generate getters and setters click ,
	//Select all , insertion point,Generate
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isCitizen() {
		return citizen;
	}
	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}
	
	
}
