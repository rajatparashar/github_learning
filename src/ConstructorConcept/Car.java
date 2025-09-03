package ConstructorConcept;

public class Car {
	//PO: user story: AC

	String name;
	int price;
	String model;
	String licenseNumber;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		
	}

	public Car(String name, String model, String licenseNumber) {
		this.name = name;
		this.model = model;
		this.licenseNumber = licenseNumber;
	}

	public Car(String name, int price, String model, String licenseNumber) {
		this.name = name;
		this.price = price;
		this.model = model;
		this.licenseNumber = licenseNumber;
	}
	
	
	public void start() {
		System.out.println("car -- start");
	}
	
	public void autoParking() {
		System.out.println("car -- autoParking");

	}
	
	

	public static void main(String[] args) {
		
		//CRUD
		
		Car c1 = new Car("Honda", 15);//Create - POST
		Car c2 = new Car("BMW", "X3", "8989898rwew");
		Car c3 = new Car("Audi", 50, "A3", "909090popop");
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber );//Read - GET
		c1.licenseNumber = "898989tetstest";//updated the license number : Update -- PUT/PATCH
		c1.model = "civic";//Update -- PUT/Patch
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber );//Read --- GET
		
		
		System.out.println("---------------");
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.licenseNumber );//Read --- GET
		c2.price = 60;
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.licenseNumber );//Read --- GET

		System.out.println("---------------");
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.licenseNumber );//Read --- GET
		c3.price = 55;//update -- PUT
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.licenseNumber );//Read --- GET

		
		
		
		
	}

}
