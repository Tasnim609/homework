package hw10UseOfSuperINChildClass;

public class Daughter extends Father{
int birthMonth;
int age;

public Daughter() {
	super();//constructor call should be the final statement of constructor class
	super.name="Gias";
	super.age=78;
	super.sex='M';
	super.usCitizen=false;
	super.familtName="Gias Uddin Chowdhury";
	super.father();
	super.fatherInfo("Gias", 78, 'M', false);
	System.out.println("This is default constractor of Daughter class");
	
}

public Daughter(int birthMonth, int age) {
	super("Gias", 78, 'M',false);//constructor call should be the final statement of constructor class
	super.age=78;
	super.name="Gias";
	super.sex='M';
	super.usCitizen=false;
	super.father();
	super.fatherInfo("Gias", 78, 'M', false);
	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("This is parameterize constractor of Daughter class");
}
public void daughter() {
	//super(); we can call /initialize the constructor inside the any method
	super.name="Gias";
	super.age=78;
	super.sex='M';
	super.usCitizen=false;
	super.father();
	super.familtName="Gias Uddin Chowdhury";
	super.fatherInfo("Gias", 78, 'M', false);
	System.out.println("This is default constractor of Daughter class");
}
public void daughterInfo(int birthMonth, int age) {
	super.name="Gias";
	super.age=78;
	super.sex='M';
	super.usCitizen=false;
	super.father();
	super.fatherInfo("Gias", 78, 'M', false);
	System.out.println("This is parameterize method of Daughter class");
}
}
