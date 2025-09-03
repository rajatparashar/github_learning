package encapsulation;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(7.0);
		double area = c.calculateArea();
		System.out.println("Area = " + area);

		double perimeter = c.calculatePerimeter();
		System.out.println("Perimeter = " + perimeter);
	}
}