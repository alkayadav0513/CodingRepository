package superConstructor;


public class Employee2 extends Employer{

	
	public Employee2(String nameOfEmployee, String addressOfEmployee, int ageOfEmployee, double grossSalary) {
		
		//Calling the SUPER CONSTRUCTOR FROM CHILD CONSTRUCTOR BODY
		super(nameOfEmployee, addressOfEmployee, ageOfEmployee, grossSalary);
		
		//Employer emp = new Employer();
		//emp.nameOfEmployee;
		//nameOfEmployee;

	}

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2("Robert","Bangalore", 50, 600000.0D );

	}

}
