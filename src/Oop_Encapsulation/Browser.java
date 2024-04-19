package Oop_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launchBrowser");
		checkBrowserVersion();
		checkOSCompatibilty();
		checkRamSpace();
		checkUpdatesAvailable();
		System.out.println("Launched successfully");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkOSCompatibilty() {
		System.out.println("checkOSCompatibilty");
	}

	private void checkRamSpace() {
		System.out.println("checkRamSpace");
	}

	private void checkUpdatesAvailable() {
		System.out.println("checkUpdatesAvailableF");
	}

}
