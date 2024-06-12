package hw11Polymorphism;



public class Sister {
public void sister() {
	System.out.println("This is void type sister method of Sister class ");
}
public  void sister(int age1, int age2) {
	int total=age1-age2;
	System.out.println("This is void type parameterize method of sister class is : "+total);
}
public int  sister(String age1 , int age2 ) {
	int total = Integer.parseInt(age1)+age2;
	System.out.println(" The int type parameterize method of sister class is : "+ total);
	return total;
}
public String sister(String fName,String lName) {
	String  fullName=fName+" "+lName;
	System.out.println("The string type parameterise method of sister class is:  "+fullName);
	return fullName;
}
public final void sister(int a,float b,int c, int d) {
	int totalValue=a+(int)b+c+d;
	System.out.println("This is final void type parameterize method of sister class is : "+totalValue);
}
public final int sister(int a ,int b, float c, int d,String e) {
	int total=a+b+(int)c+d+Integer.parseInt(e);
	System.out.println("The total final type int parameterize method of sister class is : "+total);
	return total;
	
}
public static void sister(int e,int f,int g) {
	int total=e+f+g;
	System.out.println("The static void type method of sister class is : "+total);
}
public static String sister(String  a,int b,String  c) {
	String fullName=a+String.valueOf(b)+c;
	System.out.println("The static String type method of sister class is : "+fullName);
	return fullName;
}


}