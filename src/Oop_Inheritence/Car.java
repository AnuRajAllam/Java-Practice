package Oop_Inheritence;

public class Car extends Vehicle {

	public void start() {
		System.out.println("car------start");
	}

	public void stop() {
		System.out.println("car------stop");
	}

	public void refuel() {
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
