/**
 * 
 */
package accessModifierAndInheritance;


//Dog as a child class 
//Animal a the parent class
//At this point , the parent has one child i.e. Dog - > SINGLE LEVEL INHERITANCE
public class Dog extends Animal{
	
	public String nameOfTheDog;

	public static void main(String[] args) {


		//Creating object of the Dog class
		Dog d1 = new Dog();
		d1.animalType = "Dog"; // public
		//d1.foodHabits = "carnivorous"; // private
		System.out.println("Dogs are pet animals");
		//Dog and Animal are in same package with parent child relationship.
		Dog.legs = 4; // protected
		//Dog and Animal are in same package.It does not matter if it has parent child relationship
		Dog.tail = 1; // default
		System.out.println("Generally, dogs have " + Dog.legs + " legs and " + Dog.tail + " tail.");
		d1.nameOfTheDog = "Puffy";
		System.out.println(d1.nameOfTheDog+" is of Alsatian breed");
		Dog.eat(); // public - body as defined in Dog class
		//Dog.run(); // private 
		//Dog and Animal are in same package with parent child relationship.
		d1.sleep(); // protected - overridden body as defined in Dog class
		//d1.sound(); // default - body as defined in Animal class - if not overridden
		d1.sound(); // default - overridden body is thrown as defined in Dog class 

		
		System.out.println("*********************************");
		//Creating object of the Animal class
		Animal a1 = new Animal();
		a1.animalType = "Lion, Dog, Deer, Puppy, etc."; // public
		System.out.println("Animal type can be as follows: " + a1.animalType);
		//a1.foodHabits = "carnivorous or herbivorous"; // private
		//System.out.println("Animals can be " + a1.foodHabits);
		//Dog and Animal are in same package with parent child relationship.
		Animal.legs = 4; // protected
		//Dog and Animal are in same package.It does not matter if it has parent child relationship
		Animal.tail = 1; // default
		System.out.println("Generally, animals have " + Animal.legs + " legs and " + Animal.tail + " tail.");
		Animal.eat(); // public - body as defined in Animal class
		//Animal.run(); // private - body as defined in Animal class
		//Dog and Animal are in same package with parent child relationship.
		a1.sleep(); // protected - body as defined in Animal class
		//Dog and Animal are in same package.It does not matter if it has parent child relationship
		a1.sound(); // default - body as defined in Animal class
		//a1.nameOfTheDog = "Zinga";
		//a1.security();
		
		System.out.println("************UPCASTING******************");
		Animal a2 = new Dog(); 
		a2.animalType = "Dog"; // public
		System.out.println("Animal type is as follows: " + a2.animalType);
		//a2.foodHabits = "carnivorous or herbivorous"; // private
		//Dog and Animal are in same package with parent child relationship.
		Dog.legs = 4; // protected
		//Dog and Animal are in same package.It does not matter if it has parent child relationship
		Animal.tail = 1; // default
		System.out.println("Generally, Dogs have " + Animal.legs + " legs and " + Animal.tail + " tail.");
		Animal.eat();// public - body as defined in Animal class	
		Dog.eat();// public - body as defined in Dog class	
		//Animal.run(); // private - body as defined in Animal class
		//Dog and Animal are in same package with parent child relationship.
		a2.sleep(); // protected - Overridden body as defined in Dog class
		//Dog and Animal are in same package.It does not matter if it has parent child relationship
		a2.sound(); // default - Overridden body as defined in Dog class
		//a2.nameOfTheDog = "Zinga";
		//a2.security();
	}
	
	//Exclusive method of dog
	public void security() {
		System.out.println("Dog secure houses from intruders.");
	}
	
	//Exclusive method of dog
	public static void eat() {
		System.out.println("Dog eats meat and milk.");

	}
	
	protected void sleep() {
		System.out.println("Dogs sleep in the day and secures houses at night time.");
	}
	
	//No problem on changing the access modifier to higher hierarchy - for overridden methods
//	public void sleep() {
//		System.out.println("Dogs sleep in the day and secures houses at night time.");
//	}
	
	void sound() {
		System.out.println("Puffy bark");
	}
	
	//No problem on changing the access modifier to higher hierarchy - for overridden methods
//	protected void sound() {
//		System.out.println("Puffy bark");
//	}
	
	//No problem on changing the access modifier to higher hierarchy - for overridden methods
//	public void sound() {
//		System.out.println("Puffy bark");
//	}

}

