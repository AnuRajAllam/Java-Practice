package Oop_Abstraction;

public abstract class Page {
	
	public Page() {
		System.out.println("Page----Const");
	}
	
	public Page(int i) {
		System.out.println("Page----Param Const");
	}

	public abstract void title();

	public abstract void url();

	public void pageLoadingTime() {
		System.out.println("Page====Loading time 20 secs");
	}

	public static void displayLogo() {
		System.out.println("Page====displayLogo");
	}

	public final void footers() {
		System.out.println("Page====footers");
	}

}
