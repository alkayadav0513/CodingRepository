package superConstructor;


public class Employee1 extends Employer{

	
	
	

	public Employee1(String nameOfEmployee, String addressOfEmployee, int ageOfEmployee, double grossSalary) {
		
		//Calling the SUPER CONSTRUCTOR FROM CHILD CONSTRUCTOR BODY
		super(nameOfEmployee, addressOfEmployee, ageOfEmployee, grossSalary);

	}

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("Sam","Paris", 40, 1200000.0D );

	}

}
