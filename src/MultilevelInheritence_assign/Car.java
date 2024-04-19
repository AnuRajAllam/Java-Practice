package MultilevelInheritence_assign;

public class Car extends Vehicle {
	
	final int wheels=4;
	private int time=4;
	static int Fuel=200;

	public void start() {
		System.out.println("car------start");
	}

	public void stop() {
		System.out.println("car------stop");
	}
//cannot be overriden
	public final void refuel() {
		System.out.println("car------refuel");
	}
	@Override
	public void billing() {
		System.out.println("car ----billing");
	}
	//static method cannot be overiden
	public static void carDisplay() {
		System.out.println("car====-CarDisplay");
	}
	//private methods cannot be overriden
	private static void show() {
		System.out.println("car====-show");
	}

}
