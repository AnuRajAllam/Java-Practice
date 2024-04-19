package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		String browser="ie";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome");
		}
		else if(browser.equals("fire fox")) {
			System.out.println("open ff");
		}
		else if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		else {
			System.out.println("please pass correct browsetr");
			throw new MyException("Wrong browser exception");
		}
		
		System.out.println("Open the url");
	}

}
