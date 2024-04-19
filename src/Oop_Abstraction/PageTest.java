package Oop_Abstraction;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp=new LoginPage();
		lp.doLogin("anusha", "anu123");
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.displayLogo();

		Page p=new LoginPage();
		p.footers();
		p.displayLogo();//static method
		p.pageLoadingTime();
		p.title();
		p.url();
		
	}

}
