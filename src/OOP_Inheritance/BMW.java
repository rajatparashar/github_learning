package OOP_Inheritance;

public class BMW extends Car {

	int speed = 200;
	
	//Method Overriding: Poly+Morphism: Runtime(dynamic)
	//when we have a method in a parent class and the same method in a child class:
	//1. with the same name
	//2. with the same number of parameters
	//3. with the same return type
	
	@Override
	public void start() {
		System.out.println("BMW - start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	

	//this is not overridden method from the Car class
	//method hiding
	//individual static method
	public static void billing() {
		System.out.println("BMW -- billing");
	}
	
	//this is not overridden method from the Car class
	//individual private method
	private void getCarInfo() {
		System.out.println("BMW - info");
	}

	public void getBMWInfo() {
		getCarInfo();
	}
	
}


