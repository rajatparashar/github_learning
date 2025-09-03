package ExceptionHandling;

public class User {

	public static void div(int a, int b) {
		System.out.println("division numbers");
		int z = 0;

		try {
			z = a / b;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming..please do not pass b value as zero");
			e.printStackTrace();
		}
		System.out.println(z);
	}

	public static void main(String[] args) {

		User.div(10, 0);

		System.out.println("Bye!!");

	}

}
