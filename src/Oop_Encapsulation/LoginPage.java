package Oop_Encapsulation;

public class LoginPage {

	private String userName;
	private String pwd;
	
	public LoginPage(String userName, String pwd) {
		this.userName=userName;
		this.pwd=pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public void doLogin() {
		if(isValidName()) {
		System.out.println("User nameis "+userName);
		System.out.println("password is "+pwd);
		}
	}
	
	private boolean isValidName() {
		if(userName.length()>3) {
			System.out.println("Vid name");
			return true;
		}
		else {
			System.out.println("Not valid");
			return false;
		}
	}
}
