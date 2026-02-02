package aboutInterface;

public interface IMobile {
	
	public static final String ringTone = "Breeze";
	
	default void volume() {
		System.out.println("The volume is set to minimum level");
	}
	
	//Abstract Method
	public void homeScreen();

}