package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Human human = new Human();
//		Tiger tiger = new Tiger();
//		
//		animal.move();
//		human.move();
//		tiger.move();
//		
//		animal.run();
//		human.run();
//		tiger.run();
//		
//		human.handling();
		
		Human human = new Human();
		
		human.handling();
		human.move();
		
		System.out.println();
		Animal animal = new Human();
		((Human)animal).handling();
	}

}
