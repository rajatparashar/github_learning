package AccMod1;

public class Car {
	
	//NS data members: vars + methods
	
	
	public String name;
	int price;
	protected String color;
	private String chasisNumber;
	

	public static void main(String[] args) {

		Car c = new Car();
		c.chasisNumber = "123testing";
		c.name = "Honda";
		c.price = 12;
		c.color = "White";
		
	}

}
