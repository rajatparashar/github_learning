package BuilderPattern;

public class Shopping {
	
	int orderID;

	public Shopping login() {
		System.out.println("login to app");
		return this;
	}

	public Shopping login(String un, String pwd) {
		System.out.println("login to app using : " + un + ":" + pwd);
		return this;
	}

	public Shopping search() {
		System.out.println("default search");
		return this;
	}

	public Shopping search(String productName) {
		System.out.println("search with " + productName);
		return this;
	}

	public Shopping search(String productName, int price) {
		System.out.println(" search with " + productName + price);
		return this;
	}

	public Shopping addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;
	}

	public Shopping makePayment(String upi) {
		System.out.println("making the payment using upi:"+ upi);
		return this;
	}

	public Shopping makePayment(String cc, int cvv) {
		System.out.println("making the payment using cc:"+ cc + cvv);
		return this;
	}
	
	public Shopping generateOrderId() {
		System.out.println("order id is:"+ 1212121);
		orderID = 1212121;
		supplyOrder(orderID);
		return this;
	}
	
	public Shopping logout() {
		System.out.println("logout from app");
		return this;
	}
	
	
	public void supplyOrder(int orderId) {
		
	}
	
	

}
