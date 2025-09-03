package OOP_Abstraction;

public class LoginPage extends Page{
	int timeOut = 5;

	
	public LoginPage() {
		super(10);
		System.out.println("LoginPage - default const...");
	}

	@Override
	public void title() {
		System.out.println("lp - title");
	}

	@Override
	public void url() {
		System.out.println("lp - url");
	}
	
	@Override
	public void pageLoadTimeOut() {
		System.out.println("page load time out in 5 secs");
	}
	
	//LP
	public void forgotPwd() {
		System.out.println("lp -- forgot pwd");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("lp -- login with : " + un +":"+ pwd);
	}
	

}
