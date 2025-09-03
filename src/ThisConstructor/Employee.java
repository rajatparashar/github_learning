package ThisConstructor;

public class Employee extends Company{
	
	String name;
	int age;
	
	
	public Employee() {
		//this("Tom", 30);
		System.out.println("emp default const...");
	}
	
	public Employee(String name, int age) {
		//this();
		this();
		//super();//not allowed
		
		System.out.println("emp const...");
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[] args) {
		Employee e1 = new Employee("Tom", 30);
		
//		System.out.println(e1.name);
//		System.out.println(e1.age);
	}

}
