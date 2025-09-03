package BuilderPattern;

public class FlipkartShopping {

	public FlipkartShopping doLogin(String username, String password) {
		System.out.println("Login using username and password");
		return this;
	}

	public FlipkartShopping doLogin(String gmailAccount) {
		System.out.println("Login using gmailAccount");
		return this;
	}

	public FlipkartShopping searchProduct(String productName) {
		System.out.println("search product by name " + productName);
		return this;
	}

	public FlipkartShopping searchProduct(String productName, String color) {
		System.out.println("search product by name and color " + productName + " " + color);
		return this;
	}

	public FlipkartShopping addToCart(String productName) {
		System.out.println("adding product to cart " + productName);
		return this;
	}

	public FlipkartShopping addAddress(String address) {
		System.out.println("adding address " + address);
		return this;
	}

	public FlipkartShopping checkout(String productName) {
		System.out.println("checkout " + productName);
		return this;
	}

	public FlipkartShopping paymentMethod(String upi) {
		System.out.println("making payment via upi");
		return this;
	}

	public FlipkartShopping checkout(String cc, String cvv) {
		System.out.println("making payment via credit card");
		return this;
	}

	public FlipkartShopping checkout(String cc, int cvv) {
		System.out.println("making payment via paypal");
		return this;
	}

	public FlipkartShopping palceOrder() {
		System.out.println("Placing the order");
		System.out.println("Order ID is 1234567890");
		return this;
	}

	public FlipkartShopping logout() {
		System.out.println("Logout from Flipkart");
		return this;
	}

	public FlipkartShopping closeBrowser() {
		System.out.println("Closing the browser");
		return this;
	}
}