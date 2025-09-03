package ExceptionHandling;

import java.io.File;

public class CTException {

	public static void main(String[] args) {

		System.out.println("Hi");

		int i = 10;

		try {
			Thread.sleep(5000);// CT/checked exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Bye");

		File file = new File("test.pdf");

	}

}
