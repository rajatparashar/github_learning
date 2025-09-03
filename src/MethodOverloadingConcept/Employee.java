package MethodOverloadingConcept;

public class Employee {
	// duplicate func not allowed in the same class
	// can not create a function inside a function

	// method overloading: OOP: Poly(many)+Morphism(forms): static(compile time)
	// within the same class, if you have multiple functions with:
	// 1. the same name
	// 2. different number of params
	// 3. different sequence of params
	// 4. return type does not matter

	// static method can be overloaded
	// main method can be overloaded

	public void test() {// 0 param
		System.out.println("test method");
	}

	public void test(int a) {// 1 param
		System.out.println("test method" + a);
	}

	public void test(String a) {// 1 param

	}

	public void test(int a, int b) {// 2 params

	}

	public void test(String a, int b) {// 2 params

	}

	public void test(int a, String b) {// 2 params
		System.out.println("test method" + a + b);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.test();
		e1.test(10);
		e1.test(10, "Naveen");

	}

}
