package hw08Encapsulation;

public class EmployTest {

	public static void main(String[] args) {
		Employee tangima = new Employee();
		tangima.setEmpName("Tangima");
		tangima.setEmpAge(38);
		tangima.setSex('F');
		tangima.setCitizen(false);

		System.out.println("Employee name:  " + tangima.getEmpName() + ", Employ age: " + tangima.getEmpAge()
				+ ", Employee sex: " + tangima.getSex() + ", Employee citizen: " + tangima.isCitizen());
	}

}