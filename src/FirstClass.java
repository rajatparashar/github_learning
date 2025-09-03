abstract class Car {
	public Car() {
		System.out.println("Abstract car starts...");
	}
}

class BMW extends Car {
	public BMW(String model) {
		System.out.println("BMW car starts...");
	}
}

public class FirstClass {
	public static void main(String[] args) {
		BMW obj = new BMW("B1");

	}
}