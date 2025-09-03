package BuilderPattern;

public class AmazonTest {

	public static void main(String[] args) {

		Shopping shop = new Shopping();
		
				
		//method chaining: builder pattern
		shop.login("naveen@gmail.com", "naveen123")
			.search("macbook pro")
				.addToCart("macbook pro")
					.makePayment("777777@okicici")
						.generateOrderId()
							.logout();
		
		System.out.println(shop.orderID);
		
		
		shop.login("naveen@gmail.com", "naveen123")
		.search("iphone pro")
			.addToCart("iphone pro")
				.makePayment("777777@okicici")
					.generateOrderId()
						.logout();

		System.out.println(shop.orderID);

		
		
		System.out.println(shop.orderID);
		
		System.out.println("-------");
			
		//
		shop.login("naveen@gmail.com", "naveen123")
				.search("tshirt", 1000)
					.logout();
		
		//
		shop.login("naveen@gmail.com", "naveen123")
				.search("keyboard")
					.addToCart("keyboard")
						.logout();
		
		//
		shop.login("naveen@gmail.com", "naveen123")
				.makePayment("777777@okicici")
					.logout();
		
		//
		shop.login("naveen@gmail.com", "naveen123")
					.logout();
		
		//
		shop.login("tom@gmail.com", "tom123")
				.search("shoes", 5000)
					.addToCart("nike shoes")
						.makePayment("9898 9898 9898 9888", 111)
							.generateOrderId()
								.logout();
		

		//
		shop.login("naveen@gmail.com", "naveen123");
		
		//
		shop.login()
				.logout();
			
	//this:
		//1. can be used to init the class variables with this.g = l in the constructor
		//2. encaspulation: setter: this.g = l
		//3. this() can be used to call the same class const...
		//4. in builder pattern: to generate the workflow/user jouney: every method will return this keyword
			//only the same object will be returned
			//return type: Class NAme
			//return this;
		
		
		
	}

}
