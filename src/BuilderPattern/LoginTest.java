package BuilderPattern;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage obj=new LoginPage("Anu", "anu123");
		obj.doLogin();
		LoginPage obj1=new LoginPage();
		obj1.doLogin();
		

	}

}
