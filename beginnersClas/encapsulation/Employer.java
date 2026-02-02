package encapsulation;

public class Employer {
	
	//Encapsulation has a public class.
	//Encapsulation has private instance variable
	/*To get and set the values of instance vairable, encapsulation will 
	public GET and SET methods*/
	private String nameOfEmployee;
	private String addressOfEmployee;
	private int ageOfEmployee;
	private double grossSalary;
	private double netSalary;
	
	
	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

	public String getAddressOfEmployee() {
		return addressOfEmployee;
	}

	public void setAddressOfEmployee(String addressOfEmployee) {
		this.addressOfEmployee = addressOfEmployee;
	}

	public int getAgeOfEmployee() {
		return ageOfEmployee;
	}

	public void setAgeOfEmployee(int ageOfEmployee) {
		this.ageOfEmployee = ageOfEmployee;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	/*Net Salary - Gross Salary - Income tax
	 * 
	 *  Gross Salary <=300000 = income tax is 10%
	 *  Gross Salary >=300000 and <= 600000 = income tax is 20%
	 *  Gross Salary >=600001 and <= 900000 = income tax is 30%
	 *  Gross Salary >=900001  = income tax is 40%
	 */
	private void netSalaryCalculation() {
		double gs = getGrossSalary();
		if(gs<=300000) {
			netSalary = gs - (0.1*gs);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}else if (gs>=300001 && gs<=600000) {
			netSalary = gs - (0.2*gs);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}else if (gs>=600001 && gs<=900000) {
			netSalary = gs - (0.3*gs);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}else if (gs>=900001 ) {
			netSalary = gs - (0.4*gs);
			System.out.println("Net Salary of "+this.nameOfEmployee+" is "+netSalary);
		}
	}
	
	public void getNetSalary() {
		netSalaryCalculation();
	}

}

