package aboutInterface;

//IMultipleInheritance is a child interface
//IMultipleInheritance has two parent interface: IExample,IMobile
//IExample,IMobile - are not at all related.
//It is an example of INTERFACE supporting MULTIPLE INHERITANCE which is not supported by class concept
public interface IMultipleInheritance extends IExample,IMobile{
	
	public static final int a1 = 1000;
	
	//Abstract method
	public void addition();

}

