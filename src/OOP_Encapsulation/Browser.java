package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launchBrowser");
		checkBrowserExist();
		checkBrowserVersion();
		checkBrowserComaptible();
		checkBrowerUpdates();

		System.out.println("browser is launched");

	}

	private void checkBrowserExist() {
		System.out.println("checkBrowserExist");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkBrowserComaptible() {
		System.out.println("checkBrowserComaptible");
	}

	private void checkBrowerUpdates() {
		System.out.println("checkBrowerUpdates");
	}

}
