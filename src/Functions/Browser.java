package Functions;

public class Browser {
	
	//cross browser logic: chrome/ff/edge
	//function name : launchBrowser()
	//param: String browserName
	//return : boolean: true/false
	
	
	public boolean launchBrowser(String browserName) {
		System.out.println("checking the browser..." + browserName);
		
		if(browserName.equals("chrome")) {
			System.out.println("chrome is launched");
			return true;
		}
		else if(browserName.equals("firefox")) {
			System.out.println("ff is launched");
			return true;
		}
		else if(browserName.equals("edge")) {
			System.out.println("edge is launched");
			return true;
		}
		else {
			System.out.println("plz pass the right browser..." +  browserName);
			return false;
		}
		
	}
	
	public static void main(String[] args) {

		Browser br = new Browser();
		boolean status = br.launchBrowser("chrome");
		System.out.println(status);
			if(status) {
				System.out.println("enter the url");
			}
			else {
				System.out.println("dont enter the url");
			}
		
		
	}

}
