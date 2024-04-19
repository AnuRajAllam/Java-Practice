package MultilevelInheritence_assign;

public class Vehicle extends Automobile {
	
	int speed=300;

public void engine() {
	System.out.println("Vehicle--------engine");
}

public void billing() {
	System.out.println("Vehicle ----billing");
}

@Override
public void mechancWorks() {
	System.out.println("Vehicle----MechanicWorks");
}

}