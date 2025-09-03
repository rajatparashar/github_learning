package SuperKeywordConstructor;

public class BMW extends Car{
	
	public BMW() {
		super();
		System.out.println("BMW default const...");
	}
	
	public BMW(int a) {
		super();
		System.out.println("BMW one param const..." + a);
	}
	
	public BMW(String name, int price) {
		super(name, price);//must be 1st statement in the child class const..
		System.out.println("BMW two params const..." + name + price);

	}

}

//super:
//1. can be used in child class const... but it must be the first statement
//2. can be used to call the parent class properties(vars/methods) from the child class methods
//it could be any statement number
