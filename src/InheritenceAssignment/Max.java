package InheritenceAssignment;

public class Max extends Hospital {
	
	public void ghynicTreatment() {
		System.out.println("Max------ghynicTreatment ");
	}
	@Override
	public void generalTreatment() {
		System.out.println("Max-----GeneralTreatment");
	}
	@Override
	public void bill() {
		System.out.println("Max-----bill");
	}

}
