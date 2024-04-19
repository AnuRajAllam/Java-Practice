package MultilevelInheritence_assign;

public class Audi extends Car {

	public void theftSafety() {
		System.out.println("Audi----TheftSafety");
	}
	
	@Override
	public void engine() {
		System.out.println("Audi-----Engine");
		speed=200;
	
	}
//	@Override
//	public static void carDisplay() {
//		System.out.println("car====-CarDisplay");
//	}

}
