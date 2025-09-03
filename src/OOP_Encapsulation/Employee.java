package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private boolean isActive;

	// public methods: getter/setter:

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setName(String name) {
		if (name == null) {
			System.out.println("name can not be null");
		}
		this.name = name;
	}

	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		}
		this.age = -1;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
