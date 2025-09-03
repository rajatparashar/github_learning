package encapsulation;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("Concepts of Physics");
		b1.setAuthor("H C Verma");
		b1.setPrice(150.0);
		b1.applyDiscount(10);

		String title = b1.getTitle();
		String author = b1.getAuthor();
		double price = b1.getPrice();

		System.out.println(title + " " + author + " " + price);

	}
}