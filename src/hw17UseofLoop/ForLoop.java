package hw17UseofLoop;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = -20; i <= 50; i += 1) {

			if (i % 2 == 1 || i % 2 == -1) {
				System.out.println("Odd number "+i);
			} else if (i % 2 == 0) {
				continue;
			}

		}

	}

}
