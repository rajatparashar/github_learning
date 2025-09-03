package WebDriver_Arch;

public class EdgeDriver implements WebDriver {

	public EdgeDriver() {
		System.out.println("...launching edge browser...");
	}

	@Override
	public void get(String url) {
		System.out.println("entering url: " + url);
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void findElement(String element) {
		System.out.println("found the element: " + element);
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element: " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering the value  : " + value + " into " + element);
	}

	@Override
	public void quit() {
		System.out.println("quit the browser");
	}

}
