package SuperKeywordConstructor;

public class Car {

	String name;
	int price;

	public Car() {
		System.out.println("car -- default const...");
	}

	public Car(String name, int price) {
		System.out.println("car -- two params const...");
		this.name = name;
		this.price = price;
	}

}
