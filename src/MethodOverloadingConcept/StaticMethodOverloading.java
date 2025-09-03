package MethodOverloadingConcept;

public class StaticMethodOverloading {

	// static method can be overloaded

	public static void login() {

	}

	public void login(int a) {

	}

	public static void login(String username, String password) {

	}

	public static void click() {

	}

	public static void click(String element) {

	}

	public static void click(String element, int timeOut) {

	}

	public static void main(String[] args) {

		StaticMethodOverloading obj = new StaticMethodOverloading();
		obj.login();
		StaticMethodOverloading.login();

		StaticMethodOverloading.click("login");

	}

}
