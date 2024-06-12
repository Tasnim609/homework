package hw10UseOfSuperINChildClass;

public class TestFamilyClass {
	public static void main(String[] args) {
		Father father1=new Father();
		Father father=new Father("Gias",78,'M',false);
		father.father();
		father.fatherInfo("Gias ", 78, 'M', false);
	
Daughter dd1=new Daughter();
Daughter dd=new Daughter(10, 78);

	}
}
