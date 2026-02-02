package superConstructor;

//Abstract class object cannot be created
//We can inherit an abstract class
//Abstract class may or may not have abstract method.
//Abstract method are non-static ,uses the keyword Abstract and does not have body
public abstract class Employer {
	
	//Private instance variable
	private String nameOfEmployee;
	private String addressOfEmployee;
	private int ageOfEmployee;
	private double grossSalary;
	private double netSalary;
	
	public Employer(String nameOfEmployee, String addressOfEmployee,int ageOfEmployee, double grossSalary) {
		this.nameOfEmployee = nameOfEmployee;
		this.addressOfEmployee = addressOfEmployee;
		this.ageOfEmployee =ageOfEmployee ;
		this.grossSalary = grossSalary;
		System.out.println("Name of the employee: "+this.nameOfEmployee);
		System.out.println("Age of the employee: "+this.ageOfEmployee);
		System.out.println("Address of the employee: "+this.addressOfEmployee);
		System.out.println("Gross Salary of the employee: "+this.grossSalary);
		netSalaryCalculation();
		
	}
	
	
	
	/*Net Salary - Gross Salary - Income tax
	 * 
	 *  Gross Salary <=300000 = income tax is 10%
	 *  Gross Salary >=300000 and <= 600000 = income tax is 20%
	 *  Gross Salary >=600001 and <= 900000 = income tax is 30%
	 *  Gross Salary >=900001  = income tax is 40%
	 */
	private void netSalaryCalculation() {
		if(grossSalary<=300000) {
			netSalary = grossSalary - (0.1*grossSalary);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}else if (grossSalary>=300001 && grossSalary<=600000) {
			netSalary = grossSalary - (0.2*grossSalary);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}else if (grossSalary>=600001 && grossSalary<=900000) {
			netSalary = grossSalary - (0.3*grossSalary);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}else if (grossSalary>=900001 ) {
			netSalary = grossSalary - (0.4*grossSalary);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}
	}
	

}
