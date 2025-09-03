package ExceptionHandling;

public class Browser {

	String name = "chrome";

	// RT exception: AE, NPE, AIOB
	// RT exception / unchecked exception

	public void open() {

		System.out.println("start");

		try {
			int ar[] = new int[2];// 0-1
			ar[3] = 10;// AIOB

			int i = 9 / 0;// AE

			Browser obj = new Browser();
			obj = null;
			System.out.println(obj.name);// NPE

		}
		// child
		catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		// parent
		catch (RuntimeException e) {// ChildException --->Exception --> Throwable --> Object(NA)
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		// parent
		catch (Exception e) {// ChildException --->Exception --> Throwable --> Object(NA)
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		// grand parent
		catch (Throwable e) {// ChildException --->Exception --> Throwable --> Object(NA)
			System.out.println("some exception is coming");
			e.printStackTrace();
		}

		System.out.println("End");

	}

	public static void main(String[] args) {

		Browser br = new Browser();
		br.open();

	}

}
