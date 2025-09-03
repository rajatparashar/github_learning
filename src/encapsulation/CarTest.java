package encapsulation;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCompany_name("Honda");
		c.setModel_name("Civic");
		c.setYear(2023);
		String cName = c.getCompany_name();
		String c_ModelName = c.getModel_name();
		int year = c.getYear();
		double mileage = c.getMileage();
		System.out.println(cName + " " + c_ModelName + " " + year + " " + mileage);
	}
}