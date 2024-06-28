package hw15UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
System.out.println("Please Enter your Hemoglobin A1C value below----------");
Scanner scanner =new Scanner(System.in);
//Double hbA1c;

Double hbA1c=scanner.nextDouble();
//System.out.println(hbA1c);

if (hbA1c>6.4) {
	System.out.println("I am a diabic patient");
	
}
else if (hbA1c<6.4) {//Congratulation! you have no diabetic
	 if (hbA1c>=5.7) {
		System.out.println("I am a pre diabetic");
	}
	 else if (hbA1c<5.7) {
			System.out.println("I am a healthy person");
		}
}


 else {
	System.out.println("");
}
	}

}
