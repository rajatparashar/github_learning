package ExceptionHandling;

public class Customer {

	String name = "Tom";

	public static void main(String[] args) {

		System.out.println("print the customer info");

		try {
			int i = 9 / 3;
			Customer obj = new Customer();
			obj = null;
			System.out.println(obj.name);// NPE
		}

//		catch(Exception e) {
//			System.out.println("some exception is coming");
//			e.printStackTrace();
//		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}

		System.out.println("bye");

	}

}
