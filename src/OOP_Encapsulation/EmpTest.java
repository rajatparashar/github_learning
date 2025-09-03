package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setName("tom");
		e1.setAge(10);
		e1.setSalary(23.44);
		e1.setActive(true);

		System.out.println(e1.getName());
		System.out.println(e1.getAge());

		if (e1.getAge() == -1) {
			System.out.println("not eligible for hiring");
		}

//		System.out.println(e1.getSalary());
//		System.out.println(e1.isActive());

		LoginPage lp = new LoginPage();

		lp.setUsername("naveenautomation");
		lp.setPassword("test123");
	}
}