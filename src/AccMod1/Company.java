package AccMod1;

public class Company {

	String name;
	int empCount;

	public Company() {
		System.out.println("comp -- default const...");
	}

	private Company(int a) {
		System.out.println("comp -- one param const..." + a);
	}

	Company(String a) {
		System.out.println("comp -- one param const..." + a);
	}

	protected Company(double a) {
		System.out.println("comp -- one param const..." + a);
	}

	public static void main(String[] args) {
		Company obj = new Company();//comp -- default const...
		Company obj1 = new Company(10);//comp -- one param const...10
		Company obj2 = new Company("naveen");//comp -- one param const...naveen
		Company obj3 = new Company(12.33);//comp -- one param const...12.33
	}
}