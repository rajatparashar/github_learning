package MethodOverloadingConcept;

import java.util.Arrays;

public class Shopping {

	// product requirement: User story: AC

	// functionality name: login to app
	public void login() {

	}

	public void login(String username, String password) {
		System.out.println(username + " : " + password);
	}

	public void login(String username, String password, int otp) {

	}

	public void login(String socialMedia) {

	}

	// search: us: ac: search with 4 features
	public void search() {
		System.out.println("top 10 listed products for today");
	}

	public int search(String productName) {
		System.out.println("search product: " + productName);
		return 100;
	}

	public int search(String productName, int price) {
		System.out.println("search product: " + productName + " price: " + price);
		return 40;
	}

	public int search(String productName, int price, String color) {
		System.out.println("search product: " + productName + " price: " + price + " color:" + color);
		return 10;
	}

	// add to cart:
	public void addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
	}

	// make the payment: US: AC: 1. cc/cvv 2. upi 3. un/pwd/otp

	public void payment(String cc, int cvv, String cardType) {

		switch (cardType) {
		case "visa":
			System.out.println("making the payment using: " + cc + " : " + cvv + " card  type:" + cardType);
			break;
		case "mastercard":
			System.out.println("making the payment using: " + cc + " : " + cvv + " card  type:" + cardType);
			break;

		default:
			System.out.println("thid card is not supported....payment is failed...plz use only visa/master card");
			break;
		}

	}

	public void payment(String upi) {

	}

	public void payment(String un, String pwd, int otp) {

	}

	public int generateOrder() {
		System.out.println("order is successfully done");
		return 87878;
	}

	public String getShippingDetails() {
		return "130, new st, pune";
	}

	public Object[] sendMailToCustomer() {
		System.out.println("sending the order info to mail");
		Object orderdetails[] = { 87878, "macbook pro", "sun tech, noida", "silver", 2050, getShippingDetails() };// 5
		return orderdetails;
	}

	public void logout() {
		System.out.println("logout.....bye!!");
	}

	// uber:
	public void booking(String stPoint, String endPoint) {

	}

	public void booking(String stPoint, String endPoint, String carType) {

	}

	public void booking(String stPoint, String endPoint, String carType, int userCount) {

	}

	// banking app:
	// createAccount
	// getLoan()

	// selenium:
	public void click() {

	}

	public void click(String element) {

	}

	public void click(String element, int timeOut) {

	}

	public void waitforElement(String element, int timeOut) {

	}

	public void waitforElement(String element, int timeOut, int pollingTime) {

	}

//caller method: steps
	public static void main(String[] args) {

		Shopping shop = new Shopping();
		// shop.login();
		shop.login("naveen@gmail.com", "test123");
		// shop.login("ravi@gmail.com", "test123", 1234);

		int resultCount = shop.search("macbook pro", 2000, "Silver");
		System.out.println(resultCount);

		shop.addToCart("macbook pro");

		shop.payment("9090 8787 8989 8989", 123, "visa");

		int orderId = shop.generateOrder();
		System.out.println("order id :" + orderId);

		Object myDetails[] = shop.sendMailToCustomer();
		System.out.println(Arrays.toString(myDetails));

		shop.logout();

		shop.search("Tshirt");

	}

}
