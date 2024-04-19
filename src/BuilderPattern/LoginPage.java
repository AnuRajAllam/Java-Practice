package BuilderPattern;

public class LoginPage {
	String userName;
	String pwd;
	
	public LoginPage() {
		
	}
	
	public LoginPage(String userName,String pwd) {
		this.userName=userName;
		this.pwd=pwd;
		
	}

	public void doLogin() {
		System.out.println("enter username: "+userName);
		System.out.println("enter password: "+pwd);
		System.out.println("click on login button");
		System.out.println("Logged in");
	}
}
