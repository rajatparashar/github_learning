package ExceptionHandling;

public class ErrorHandling {

	public static void m1() {
		System.out.println("m1 method");
		try {
			m2();
		} catch (Error e) {
			System.out.println("stack is full.....");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("excdeption is coming.....");
			// e.printStackTrace();
		}
	}

	public static void m2() {
		System.out.println("m2 method");
		m1();
	}

	public static void main(String[] args) {

		ErrorHandling.m1();

		// Error vs Exception ----> Throwable

//		System.out.println("hi");
//
//		try {
//			System.out.println("some logic");
//			//exception
//			//error
//		}
//		
//		catch (Throwable e) {
//			System.out.println("some error or exception is coming...");
//			e.printStackTrace();
//		}

	}

}
