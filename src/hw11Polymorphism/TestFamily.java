package hw11Polymorphism;

public class TestFamily {
public static void main(String[] args) {
	Sister sister=new Sister();
	sister.sister();
	sister.sister(100, 200);
	sister.sister("Dawsi", "Qurashy");
	sister.sister("77", 20);
	sister.sister(10, 2.45f, 30, 40);
	sister.sister(10, 20, 30, 40, "50");
	Sister.sister(22, 33, 44);
	Sister.sister("5", 5, "5");
	
	System.out.println("....................................................");
	
	Nice nice=new Nice();
	nice.sister();
	nice.sister(100, 200);
	nice.sister("Tasnim", "chowdhury");
	nice.sister("77", 20);
	
}
}
