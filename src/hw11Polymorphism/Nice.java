package hw11Polymorphism;

public class Nice extends Sister{
	@Override
	public void sister() {
		System.out.println("This is void type sister method of Nice  class");
	}
	@Override
	public  void sister(int age1, int age2) {
		int total=age1-age2+200;
		System.out.println("This is void type parameterize method of Nice class is : "+total);
	}
	@Override
	public int  sister(String age1 , int age2 ) {
		int total = Integer.parseInt(age1)/2+age2+100;
		System.out.println(" Int type parameterize method of Nice class : "+ total);
		return total;
	}
	@Override
	public String sister(String fName,String lName) {
		String  fullName=fName+" "+lName+500;
		System.out.println("The String type parameterize method of nice class is:  "+fullName);
		return fullName;
	}//
	/*@Override
	public final void sister(int a,float b,int c, int d) {
		int totalValue=a+(int)b+c+d;
		System.out.println("This is final void type parameterize method"+totalValue);
	}
	public final int sister(int a ,int b, float c, int d,String e) {
		int total=a+b+(int)c+d+Integer.parseInt(e);
		System.out.println("The total final int parameterize method is :"+total);
		return total;
		
	}*
	/*@Override
	public static void sister(int e,int f,int g) {
		int total=e+f+g;
		System.out.println("The static void method is :"+total);
	}
	public static String sister(String  a,int b,String  c) {
		String fullName=a+String.valueOf(b)+c;
		System.out.println("The static String type method is : "+fullName);
		return fullName;
	}*/


}
