package OOP_Encapsulation;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User("Naman", 40, 34.55, true);// POST -- create user

		System.out.println(u1.getName() + " " + u1.getAge() + " " + u1.getSalary() + " " + u1.isActive());// GET - Read

		u1.setSalary(45);// PUT/Patch -- Update

		System.out.println(u1.getName() + " " + u1.getAge() + " " + u1.getSalary() + " " + u1.isActive());// GET -- Read

		u1.setAge(41);

		System.out.println(u1.getName() + " " + u1.getAge() + " " + u1.getSalary() + " " + u1.isActive());// GET -- Read
	}
}