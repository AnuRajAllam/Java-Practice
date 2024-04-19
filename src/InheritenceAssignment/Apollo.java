package InheritenceAssignment;

public class Apollo extends Hospital {
	
	public void cardiologyTreatment() {
		System.out.println("Apollo------cardiology ");
	}
	@Override
	public void generalTreatment() {
		System.out.println("Apollo-----GeneralTreatment");
	}
	@Override
	public void bill() {
		System.out.println("Apollo-----bill");
	}

}
