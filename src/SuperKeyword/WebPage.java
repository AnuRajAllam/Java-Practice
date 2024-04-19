package SuperKeyword;

public class WebPage extends Page {
	
	public int speed=10;
	
	public WebPage() {
		System.out.println("WP----Cont");
	}
	
	public WebPage(int i) {
		System.out.println("WP----ParamCont"+i);
	}
	
	public void calculatePgeTimeOut()
	{
		System.out.println("WebPage------calculatePgeTimeOut");
	}
	
	public final void logo() {
		System.out.println("WebPage------logo");
	}
}
