package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			// report:
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("Hello world");

		System.out.println("Bye!!");

		try {
			int p = 9 / 0;
		} catch (ArithmeticException e) {
			// report:
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("Bye world");

	}

}
