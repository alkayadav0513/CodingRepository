package encapsulation;

public class Employee2 {

	public static void main(String[] args) {
		Employer emp1 = new Employer();
		emp1.setNameOfEmployee("Robert");
		emp1.setAddressOfEmployee("Bangalore");
		emp1.setAgeOfEmployee(40);
		emp1.setGrossSalary(400000.0D);
		System.out.println(emp1.getNameOfEmployee()+"--"+emp1.getAddressOfEmployee()
		+"--"+emp1.getAgeOfEmployee()+"--"+emp1.getGrossSalary());
		emp1.getNetSalary();

	}

}
