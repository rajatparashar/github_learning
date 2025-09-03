package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String city;
	boolean isActive;
	double salary;

	// constructor:
	// name: will be same as class name
	// const.. is not a function (it looks like a function)
	// const.. can never have any return type, no void, no return keyword
	// const.. can have params
	// const.. will be called when you create the object but function will be called using obj reference variable
	//if the default const.. is not available in the class, then jvm will add one default hidden const.. in the class at the runtime
	//const... can be overloaded
	
	
	public Employee() { //0 param
		System.out.println("default const... 0 param");
	}
	
	public Employee(int a) { // 1 param
		System.out.println("const... 1 param " + a);
	}
	
	public Employee(int a, int b) { // 2 param
		System.out.println("const... 2 params " + a+b);
	}
	
	public Employee(String a, int b) { // 2 param
		System.out.println("const... 2 params " + a+b);
	}
	
	public Employee(int a, String b) { // 2 param
		System.out.println("const... 2 params " + a+b);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10,20);
		Employee e4 = new Employee(20, "selenium");

	}

}


