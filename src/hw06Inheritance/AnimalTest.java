package hw06Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mamalInfo();
		mammal.animalInfo();

		Reptail reptail = new Reptail();
		reptail.reprailInfo();
		reptail.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mamalInfo();
		dog.animalInfo();

		Snake snake = new Snake();
		snake.snakeINfo();
		snake.reprailInfo();
		snake.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDofInfo();
		bullDog.dogInfo();
		bullDog.mamalInfo();
		bullDog.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.reprailInfo();
		cobra.snakeINfo();
		cobra.animalInfo();

	}
}
