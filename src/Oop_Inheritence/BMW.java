package Oop_Inheritence;

public class BMW extends Car {

	public void autoParkin() {
		System.out.println("BMW------AutoParking");
	}
	
     //method overridden
	@Override
	public void start() {
		System.out.println("BMW------start");
	}
	@Override
	public void billing() {
		System.out.println("Vehicle ----billing");
	}
	public static void carDisplay() {
		System.out.println("BMW====-CarDisplay");
	}
}
