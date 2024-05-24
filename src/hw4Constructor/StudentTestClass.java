package hw4Constructor;

public class StudentTestClass {

	public static void main(String[] args) {
		
		//when class is initialize ,means object is created so constructor initialize
		//default constructor initialize
		Student ST=new Student();
		
		//parameterize constructor initialize
		//parameterize constructor have advantage ,we can reuse many time
		Student tasnim=new Student("tasnim",205,'F',true);
		Student maria=new Student("maria",105,'F',true);
		Student aysha=new Student("Aysha",305,'F',true);
		Student ila=new Student("Ila",405,'F',true);
		Student rony=new Student("Rony",505,'M');
		Student nazia=new Student("nazia",605,'F',false,2.8f);
		Student s=new Student("Rony",505);
		//Sequence of argument should be same as parameter inside the parameterize constructor
		//

	}

}
