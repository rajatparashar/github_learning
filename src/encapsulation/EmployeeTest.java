package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmployee_id(1234);
		e1.setEmployee_name("Dev");

		System.out.println("Employee name: " + e1.getEmployee_name());
		System.out.println("Employee id: " + e1.getEmployee_id());
		System.out.println("Employee salary: " + e1.getEmployee_salary());
	}
}