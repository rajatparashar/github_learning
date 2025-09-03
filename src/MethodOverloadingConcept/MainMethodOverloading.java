package MethodOverloadingConcept;

public class MainMethodOverloading {

	// main() method can be overloaded

	// psvm: String []
	public static void main(String[] args) {
		System.out.println("hello world");

		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "Selenium");

	}

	public static void main(int a) {
		System.out.println("hello world" + a);
	}

	public static void main(int a, String b) {
		System.out.println("hello world" + (a + b));
	}

}
