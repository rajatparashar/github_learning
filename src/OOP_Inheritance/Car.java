package OOP_Inheritance;


//final class: to prevent inheritance: it can not be a parent class
public class Car extends Vehicle{	
	
	int speed = 100;
	
	@Override
	public void start() {
		System.out.println("Car - start");
	}

	public void stop() {
		System.out.println("Car - stop");
	}

	public void refuel() {
		System.out.println("Car - refuel");
	}

	//final method can not be overridden -- 
	public final void increaseSpeed() {
		System.out.println("Car -- increaseSpeed");
	}
	
	//static method: can not be overridden
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
	//private method: can not be overridden
	private void getCarInfo() {
		System.out.println("Car - info");
	}
	
	public void getInfo() {
		getCarInfo();
	}
	
	
}

