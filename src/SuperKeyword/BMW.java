package SuperKeyword;

public class BMW extends Car{
	
	int speed = 200;
	
	@Override
	public void start() {
		super.start();//Car start
		System.out.println("BMW - start");
	}
	
	public void displaySpeed() {
		System.out.println(speed);//200
		displayVehicleSpeed();
		System.out.println(super.speed);//100

	}
	
	//method hiding
	public static void billing() {
		Car.billing();
		System.out.println("BMW -- billing");
	}

}
