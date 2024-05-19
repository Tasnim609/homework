package hw2javaVariablesInitialized;

public class AboutMe {
	// variable declared
	public String myName1;
//variable initialized
	public String myName = "Tasnim";
//excess modifier+dataType+variable/object/reference variable="Value";
	// excess modifier =public,private,protected,default
	public int myAge = 41;
	private float myHight = 5.3f;
	protected boolean myCitizen = true;
	char myGender = 'F'; // default

//constructor declare
	public AboutMe() {
		// constructor body
		System.out.println("I am Tasnim From AboutMe class");
	}

//inside the main method we can initialized the constructor
	public static void main(String[] args) {
		//when we an object by this class, is called Instantiation
		//after create the object,class is Instantiated
		//when we create an object (tasnim1) from this class, Constructor will be instantiated
		//we can create more then one object from a class
		AboutMe tasnim1 = new AboutMe();
		System.out.println(tasnim1.myName);
		System.out.println(tasnim1.myAge);
		System.out.println(tasnim1.myCitizen);
		System.out.println(tasnim1.myGender);
		System.out.println(tasnim1.myHight);

	}
}
//for organize the code =put the courser in the Editor,then,shift+command/control+F