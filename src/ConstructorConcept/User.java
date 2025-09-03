package ConstructorConcept;

public class User {

	// const.. is helping to construct the object properly
	// const is helping to prevent unnecessary object creation
	// const.. is helping to initialize the class instance variable with the local
	// variable using this keyword
	// instance variable

	String name;
	int age;
	String city;
	boolean isActive;
	double salary;

	public User(String name, int age) {
		this.name = name; // G = L
		this.age = age;
	}

	public User(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public User(String name, int age, String city, boolean isActive, double salary) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
		this.salary = salary;
	}

	public static void main(String[] args) {

		User u1 = new User("Nitin", 30);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);

		System.out.println("------------");

		User u2 = new User("Rajat", 35, 34.44);
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.city);
		System.out.println(u2.isActive);
		System.out.println(u2.salary);

		System.out.println("------------");

		User u3 = new User("Sanju", 25, "Pune", true, 24.55);
		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.city);
		System.out.println(u3.isActive);
		System.out.println(u3.salary);
		System.out.println("------------");
	}
}