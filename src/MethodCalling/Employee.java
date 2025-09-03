package MethodCalling;

public class Employee {

	String name;
	int age;

	public static void getInfo(Employee e) {
		e.name = "Mohit";
		e.age = 50;
		System.out.println(e.name);// mohit
		System.out.println(e.age);// 50

	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 20;

		System.out.println(e1.name);// Tom
		System.out.println(e1.age);// 20

		Employee.getInfo(e1);//call be ref

		System.out.println(e1.name);// mohit
		System.out.println(e1.age);// 50

	}

}

