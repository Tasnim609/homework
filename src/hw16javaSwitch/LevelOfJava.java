package hw16javaSwitch;

import java.util.Scanner;

public class LevelOfJava {

	public static void main(String[] args) {
		System.out.println("<-------Please write your java level");
		Scanner scanner = new Scanner(System.in);
		String myLevel = scanner.next();
		switch (myLevel) {
		case "Beginner":
			System.out.println("I am at the beginning level");
			break;
		case "Intermediate":
			System.out.println("I am at the Intermediate level");
			break;
		case "Expert":
			System.out.println("I am at the Expert level");
			break;
		case "Excelent":
			System.out.println("I am at the Excelent level");
			break;

		default:
			System.out.println("I have java Certification from Oracale or  I am a Drop out");
			break;
		}
		scanner.close();
	}

}
