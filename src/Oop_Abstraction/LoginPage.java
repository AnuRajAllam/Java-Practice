package Oop_Abstraction;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP----Const");
	}

	@Override
	public void title() {

		System.out.println("LP-----title");
	}

	@Override
	public void url() {
		System.out.println("LP---ul");

	}
	@Override
	public void pageLoadingTime() {
		System.out.println("Page====Loading time 5 secs");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Username is:"+un+"pwd is:"+pwd);
	}

}
