package WebDriver_Arch;

public class FireFoxDriver implements WebDriver {
	@Override
	public void enterUrl(String URL) {
		System.out.println("The Url is:"+URL);

	}

	@Override
	public String getTitle() {

		return "Amazon";
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "www.amaazon.com";
	}

	@Override
	public void sendKeys(String Element, String value) {
		System.out.println("element is " + Element + " value " + value);

	}

	@Override
	public void close() {

		System.out.println("Close driver");

	}

	@Override
	public void findElement(String element) {
		System.out.println("element is " + element);
		// TODO Auto-generated method stub

	}

	@Override
	public void findElements() {

		System.out.println("Get all the elements ");
		// TODO Auto-generated method stub

	}

	@Override
	public void click(String elename) {
		// TODO Auto-generated method stub
		System.out.println("click the elements "+elename);
	}

}
