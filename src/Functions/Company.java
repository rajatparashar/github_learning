package Functions;

public class Company {

	public void getMail() {
		System.out.println("getting mail");
	}

	public static void sendMail() {
		System.out.println("sending mail");
	}
	
	public static int getNumber() {
		return 100;
	}
	
	

	public static void main(String[] args) {

		Company c1 = new Company();
		Company c2 = new Company();

		//how to call non static methods:
		c1.getMail();
		
		//how to call static methods:
		//1. using the class name:
		Company.sendMail();
		//2. call it directly:
		sendMail();
		//3. using the ref name: warning: should be accessed in a static way
		c1.sendMail();
		
		int n = Company.getNumber();
		System.out.println(n);
	}

}
