package Functions;

public class WebDriver {

	public boolean launchBrowser(String browserName) {
		System.out.println("checking the browser..." + browserName);

		boolean flag = false;

		switch (browserName.toLowerCase().trim()) {// chrome -->chrome 
		case "chrome":
			System.out.println("chrome is launched");
			flag = true;
			break;
		case "firefox":
			System.out.println("ff is launched");
			flag = true;
			break;
		case "edge":
			System.out.println("edge is launched");
			flag = true;
			break;

		default:
			System.out.println("please pass the right browser..." + browserName);
			break;
		}

		return flag;

	}

	//user method: main(): will help me to call the methods by passing the values
	public static void main(String[] args) {
		WebDriver driver = new WebDriver();
		boolean isLaunched = driver.launchBrowser("chrome1");
		System.out.println(isLaunched);
		
		if(isLaunched) {
			System.out.println("enter the url");
		}
		else {
			System.out.println("dont enter the url");
		}
	}

}
