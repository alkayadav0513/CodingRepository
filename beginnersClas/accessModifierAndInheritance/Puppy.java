package accessModifierAndInheritance;


//Puppy is the child class and grand child of Animal class.
//Dog is the parent class.
//Animal is the grand parent class.
//Puppy will inherit the properties of Dog an Animal class.
//At this moment , it is MUTI-LEVEL INHERITANCE betwennAnimal, Dog and Puppy
public class Puppy extends Dog {

	public static void main(String[] args) {
		
		// Creating object of the Puppy class
		Puppy p1 = new Puppy();
		p1.animalType = "Puppy"; // public
		System.out.println(p1.animalType+ " are pet animals");
		// p1.foodHabits = "carnivorous"; // private
		// Puppy, Dog  are in same package with parent child relationship.
		Puppy.legs = 4; // protected
		// Dog and puppy are in same package.It does not matter if it has no parent child relationship
		Puppy.tail = 1; // default
		System.out.println("Generally, puppies have " + Puppy.legs + " legs and " + Puppy.tail + " tail.");
		p1.nameOfTheDog = "Zinga";
		System.out.println(p1.nameOfTheDog + " is of Alsatian breed");
		Puppy.eat(); // public - body as defined in Puppy class
		//Puppy.run(); // private
		// Dog and Puppy are in same package with parent child relationship.
		p1.sleep(); // protected - overridden body as defined in Puppy class
		p1.sound(); // default - overridden body as defined in Puppy class
		//p1.sound(); // default - Will throw body of Dog class if not overridden in Puppy class as Puppy is inheriting DOG.
		p1.security();//public  - overridden body as defined in Puppy class
		p1.play(p1.nameOfTheDog); //public - body as defined in Puppy class
		
		System.out.println("***************************");
		//Creating object of the Dog class
		Dog d1 = new Dog();
		d1.animalType = "Dogs"; // public
		// d1.foodHabits = "carnivorous"; // private
		System.out.println(d1.animalType + " are pet animals");
		// Dog and Animal are in same package with parent child relationship.
		Dog.legs = 4; // protected
		// Dog and Animal are in same package.It does not matter if it has no parent child
		// relationship
		Dog.tail = 1; // default
		System.out.println("Generally, dogs have " + Dog.legs + " legs and " + Dog.tail + " tail.");
		d1.nameOfTheDog = "Puffy";
		System.out.println(d1.nameOfTheDog + " is of Alsatian breed");
		Dog.eat(); // public - body as defined in Dog class
		// Dog.run(); // private
		// Dog and Animal are in same package with parent child relationship.
		d1.sleep(); // protected - overridden body as defined in Dog class
		// d1.sound(); // default - body as defined in Animal class - if not overridden
		d1.sound(); // default - overridden body is thrown as defined in Dog class 
		//d1.play(d1.nameOfTheDog);
		
		System.out.println("*********************************");
		//Creating object of the Animal class
		Animal a1 = new Animal();
		a1.animalType = "Lion, Dog, Deer, Puppy, etc."; // public
		System.out.println("Animal type can be as follows: " + a1.animalType);
		//a1.foodHabits = "carnivorous or herbivorous"; // private
		//System.out.println("Animals can be " + a1.foodHabits);
		//Dog and Animal are in same package with parent child relationship.
		Animal.legs = 4; // protected
		//Dog and Animal are in same package.It does not matter if it has no parent child relationship
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
		//a1.play(d1.nameOfTheDog);
		
		System.out.println("************UPCASTING******************");
		Animal a2 = new Dog(); 
		a2.animalType = "Dog"; // public
		System.out.println("Animal type is as follows: " + a2.animalType);
		//a2.foodHabits = "carnivorous or herbivorous"; // private
		//Dog and Animal are in same package with parent child relationship.
		Dog.legs = 4; // protected
		//Dog and Animal are in same package.It does not matter if it has no parent child relationship
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
		//a2.play(d1.nameOfTheDog);
		
		System.out.println("************UPCASTING******************");
		Dog d2 = new Puppy(); 
		d2.animalType = "Puppy"; // public
		System.out.println("Animal type is as follows: " + d2.animalType);
		//d2.foodHabits = "carnivorous or herbivorous"; // private
		//Dog and Puppy are in same package with parent child relationship.
		Dog.legs = 4; // protected
		Puppy.legs = 4;// protected
		//Dog and Puppy are in same package.It does not matter if it has no parent child relationship
		Puppy.tail = 1; // default
		Dog.tail = 1; // default
		System.out.println("Generally, Dogs have " + Puppy.legs + " legs and " + Puppy.tail + " tail.");
		Puppy.eat();// public - body as defined in Puppy class	
		Dog.eat();// public - body as defined in Dog class	
		//Puppy.run(); // private - body as defined in Animal class
		//Dog and Puppy are in same package with parent child relationship.
		d2.sleep(); // protected - Overridden body as defined in Puppy class
		//Dog and Puppy are in same package.It does not matter if it has no parent child relationship
		d2.sound(); // default - Overridden body as defined in Puppy class
		d2.nameOfTheDog = "Zinga";
		d2.security();// public  - Overridden body as defined in Puppy class
		//d2.play(d1.nameOfTheDog);
	}

	// Exclusive method of Puppy class
	public static void eat() {
		System.out.println("Puppies drink milk.");

	}

	// Overridden method in Puppy class from Dog class
	public void security() {
		System.out.println("Puppies cannot secure houses from intruders as they are small.");
	}

	// Overridden method in Puppy class from Animal class - changed the access
	// modifier
	public void sleep() {
		System.out.println("Puppies always sleep.");
	}

	// Overridden method in Puppy class from Animal class
	void sound() {
		System.out.println("Puppies also bark");
	}

	// Exclusive method of Puppy class
	public void play(String name) {
		System.out.println(name + " plays all the time.");
	}

}

