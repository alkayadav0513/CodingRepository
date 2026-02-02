package testaccessModifierAndInheritance;

import accessModifierAndInheritance.Animal;

//Lion is a child class.
//Animal is a parent class
//Lion and Dog are siblings.
//Animal has two child i.e. Dog and Lion - HIERARCHICL INHERITANCE
public class Lion extends Animal{

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.animalType = "Lion"; // public
		System.out.println("Animal type can be as follows: " + l1.animalType);
		//l1.foodHabits = "carnivorous"; // private
		//System.out.println("Animals can be " + a1.foodHabits);
		//Lion and Animal are in different package with parent child relationship.
		Lion.legs = 4; // protected
		//Lion and Animal are in different package.It does not matter if it has  parent child relationship
		//Lion.tail = 1; // default
		System.out.println("Generally, Lions have " + Lion.legs);
		Lion.eat(); // public - body as defined in Lion class
		l1.run(); // private - body as defined in Lion class
		//Lion and Animal are in different package with parent child relationship.
		
		//For below refer  -point 4>v>case 2 in the JPG document
		l1.sleep(); // protected - body as overridden in Lion class
		l1.sound(); // default - body as defined in Lion class
		
		System.out.println("***********************");
		Animal a1 = new Animal();
		a1.animalType = "Lion, Dog, Deer, Puppy, etc."; // public
		System.out.println("Animal type can be as follows: " + a1.animalType);
		//a1.foodHabits = "carnivorous or herbivorous"; // private
		//System.out.println("Animals can be " + a1.foodHabits);
		//Lion and Animal are in different package with parent child relationship.
		Animal.legs = 4; // protected
		//Lion and Animal are in different package
		//Animal.tail = 1; // default
		System.out.println("Generally, animals have " + Animal.legs );
		Animal.eat(); // public - body as defined in Animal class
		//Animal.run(); // private - body as defined in Animal class
		//Lion and Animal are in different package with parent child relationship.
		
		//For below refer  -point 4>v>case 2 in the JPG document
		//a1.sleep(); // protected - body as defined in Animal class
		
		//a1.sound(); // default - syntax error as the parent is in different package with the sound() method

	}
	
	//Exclusive method of Lion class
	public static void eat() {
		System.out.println("Lions hunts for meat.");

	}
	
	//Exclusive method of Lion class
	private void run() {
		System.out.println("Lions run for hunting.");
	}
	
	/*This method  of the parent class can be overridden as it is protected method 
	 * which can be used between parent and child which are in 
	 * different packages.
	 */
	protected void sleep() {
		System.out.println("Lion sleep in daytime as they are nocturnal animals.");
	}
	
	/*This method  of the parent class cannot be overridden as it is default method 
	 * which can be used between classes of same package. Lion class and
	 * Animal class belongs to different packages.
	 */
	//Exclusive method of Lion class
	void sound() {
		System.out.println("Lions Roar.");
	}

}