package OOP_Abstraction;

public class AppTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.pageLoadTimeOut();
		lp.logo();
		lp.forgotPwd();
		lp.doLogin("admin", "admin123");
		System.out.println(lp.timeOut);
		
		
		System.out.println("-----------");
		
		//top casting: child class object can be referred by abstract parent class ref variable.
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadTimeOut();
		pg.logo();
		
		//down casting: NA
		
		
		
	}

}
