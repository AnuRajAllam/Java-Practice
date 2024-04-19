package WebDriver_Arch;

import ExceptionHandling.MyException;

public class App_Test {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String Browser ="dsfad";
		
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			System.out.println("The browser is "+Browser);
			break;
			
		case "firefox":
			driver=new FireFoxDriver();
			System.out.println("The browser is "+Browser);
			break;
			
		case "safari":
			driver=new SafariDriver();
			System.out.println("The browser is "+Browser);
			break;

		default:
			System.out.println("Please select correct browser");
			throw new MyException("WRONGBROWSEREXCEPTION");
			//break;
		}
		
		driver.enterUrl("www.amazon.com");
		System.out.println(driver.getUrl());
		System.out.println(driver.getTitle());
		
		if(driver.getTitle()=="Amazon") {
			driver.findElement("Username");
			driver.sendKeys("Username", "anu");
			driver.sendKeys("Pssword", "anu@123");
		}
		else {
			System.out.println("incorrect title");
		}
		driver.click("LoginButton");
		driver.findElement("logo");
		driver.close();
		

	}

}
