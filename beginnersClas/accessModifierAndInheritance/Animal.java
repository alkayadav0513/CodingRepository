
package accessModifierAndInheritance;
public class Animal {

	public String animalType;// Horse, Lion, Deer, Dog
	private String foodHabits; // carnivorous or herbivorous
	protected static int legs;
	static int tail;

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.animalType = "Lion, Dog, Deer, Puppy, etc."; // public
		System.out.println("Animal type can be as follows: " + a1.animalType);
		a1.foodHabits = "carnivorous or herbivorous"; // private
		System.out.println("Animals can be " + a1.foodHabits);
		Animal.legs = 4; // protected
		Animal.tail = 1; // default
		System.out.println("Generally, animals have " + Animal.legs + " legs and " + Animal.tail + " tail.");
		Animal.eat(); // public - body as defined in Animal class
		Animal.run(); // private - body as defined in Animal class
		a1.sleep(); // protected - body as defined in Animal class
		a1.sound(); // default - body as defined in Animal class

	}

	public static void eat() {
		System.out.println("Some animal eats meats and some vegetables or leaves.");

	}

	private static void run() {
		System.out.println("Some animal can run while others walk or swim.");
	}

	protected void sleep() {
		System.out.println("Some animal sleep in the night while others are nocturnal.");
	}

	void sound() {
		System.out.println("Different animals make different sound");
	}

}

