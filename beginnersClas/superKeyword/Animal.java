package superKeyword;

public class Animal {
	
	//Instance Variable
	public String colour = "can be of any colour.";
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		//The below line does the print out - Animals can be of any colour.
		System.out.println("Animals "+ a1.colour );
		a1.sound();
		
		//Super cannot be used in parent class
		//Super to be in static methods
		//System.out.println(super.colour);
	}
	
	public void sound() {
		//Super cannot be used in parent class
		//System.out.println(super.colour);
		System.out.println("Different animals make different sound.");
	}

}

