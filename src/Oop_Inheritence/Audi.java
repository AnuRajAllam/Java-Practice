package Oop_Inheritence;

public class Audi extends Car{
	
	public void theftSafety() {
		System.out.println("Audi----TheftSafety");
	}
	
	@Override
	public void engine() {
		System.out.println("Audi-----Engine");
	}

}
