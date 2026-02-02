package encapsulation;

public class Employee1 {

	public static void main(String[] args) {
		Employer emp1 = new Employer();
		emp1.setNameOfEmployee("Sam");
		emp1.setAddressOfEmployee("Paris");
		emp1.setAgeOfEmployee(30);
		emp1.setGrossSalary(900000.0D);
		System.out.println(emp1.getNameOfEmployee()+"--"+emp1.getAddressOfEmployee()
		+"--"+emp1.getAgeOfEmployee()+"--"+emp1.getGrossSalary());
		emp1.getNetSalary();

	}

}




