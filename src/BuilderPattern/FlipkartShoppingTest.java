package BuilderPattern;

public class FlipkartShoppingTest {

	public static void main(String[] args) {
		System.out.println("_________________________");
		// 1. Login - search product - add to cart - logout
		FlipkartShopping j1 = new FlipkartShopping();
		j1.searchProduct("macbook")
			.addToCart("macbook")
				.logout();

		System.out.println("_________________________");
		// 2. Login - add address - logout
		FlipkartShopping j2 = new FlipkartShopping();
		j2.doLogin("gmail")
			.addAddress("12/24, Navi mumbai, 282004")
					.logout();
		System.out.println("_________________________");
		// 3. Login - search product - add to cart - checkout - make payment - place order - logout - close browser

		FlipkartShopping j3 = new FlipkartShopping();
		j3.doLogin("testuser","user@123")
			.searchProduct("macbook pro")
				.addToCart("macbook pro")
					.checkout("macbook pro")
						.paymentMethod("325457@upi")
							.palceOrder()
								.logout()
									.closeBrowser();
		System.out.println("_________________________");
		// 4. Login - logout
		FlipkartShopping j4 = new FlipkartShopping();
		j4.doLogin("testuser","user@123")
			.logout();

	}

}
