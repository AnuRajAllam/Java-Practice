package SuperKeyword;

public class HomePage extends WebPage {

	public int speed = 50;

	public HomePage() {
		super();
		System.out.println("HP----Cont");
	}

	public HomePage(int i) {
		System.out.println("HP----ParamCont"+i);
	}
	
	public void calculateTimeOut() {
		System.out.println("HomePage-----calculateTimeOut");
	}
	
	@Override
	public void calculatePgeTimeOut() {
		super.calculatePgeTimeOut();
		System.out.println("HomePage------calculatePgeTimeOut");
		super.logo();
		System.out.println(super.speed);
		System.out.println(speed);
		super.pagePanel();
	}

}
