class Parent {
	static void greet() {
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent {
	static void greet() {
		System.out.println("Hello from Child");
	}
}

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		p.greet(); // Output: Hello from Parent (compile-time binding)
	}
}