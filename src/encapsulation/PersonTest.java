package encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Arun");
		p1.setAge(25);
		p1.setCountry("India");

		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());
		System.out.println("Country: " + p1.getCountry());
	}
}