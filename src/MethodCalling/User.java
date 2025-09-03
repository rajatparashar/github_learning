package MethodCalling;

public class User {

	public void m1() {
		System.out.println("m1 method");
		m2();
		//User.t1();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		// m1();
	}

	public static void t1() {
		System.out.println("t1 method");
		User.t2();
		User u2 = new User();
		u2.m1();
	}

	public static void t2() {
		System.out.println("t2 method");
		User.t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public static void main(String[] args) {
		
		//NS --> S: use class name
		//S ---> NS: use object ref name
		//s --> s: use class name
		//NS --> NS: call them directly (no need to create extra object)
		
		 User u1 = new User();
		 u1.m1();
		 //User.t1();
		 
		 

	}

}
