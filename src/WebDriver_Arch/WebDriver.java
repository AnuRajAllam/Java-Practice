package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	public void enterUrl(String URl);

	public String getTitle();

	public String getUrl();

	public void click(String elename);

	public void sendKeys(String Element, String value);

	public void close();

	@Override
	public void findElement(String element);

	@Override
	public void findElements();

}
