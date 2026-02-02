package superKeyword;

/*
* Using super keyword to get the value of the instance variable defined in parent class
* where the parent and child class has same instance variable name.
*/

/*
* Using super keyword, get the body of a non-static method defined in parent class 
* from child class; where non-static method is overridden in child class.
* 
*/

//Super keyword has to be used in child class.
//The parent and child class has same instance variable

public class Dog extends Animal{
	
	//Instance Variable
	public String colour = "brown.";

	public static void main(String[] args) {
		
		/*When we created object of child class, an object of parent class
		is implicitly created which is referred by super reference variable.*/
		Dog d1 = new Dog();
		
		//The below line prints out - The colour of the dog is brown.
		//The below line does not print out - The colour of the dog is can be of any colour..
		System.out.println("The colour of the dog is "+d1.colour);
		
		//Getting the value of the instance variable "colour" defined in Animal parent class
		//super cannot be used in static method
		//System.out.println(super.colour);
		
		//Call the colourMethod()
		d1.colourMethod();
		
		//Call the sound() method overridden in Dog class- throw the overridden body
		d1.sound();
		
		//Call the sound() method body as defined  in Animal class
		//super cannot be used in static method
		//super.sound();
		
		//Call the soundMethod()
		d1.soundMethod();

	}
	
	public void colourMethod() {
		System.out.println("*****colourMethod()****");
		//Get the value of colour as "brown." as defined in child class
		System.out.println("Dog's colour is "+colour);
		
		//Get the value of colour as "can be of any colour." as defined in parent class
		//Super keyword used in non-static method of child class
		System.out.println("Animals "+super.colour);
	}
	
	public void sound() {
		System.out.println("Dogs bark.");
	}
	
	public void soundMethod() {
		System.out.println("*****soundMethod()****");
		//Call the sound() method overridden in Dog clas s- throw the body overridden  in Dog class
		sound();
		//Call the sound() method defined in Animal class class - throw the body defined in Animal class
		super.sound();
	}

}
