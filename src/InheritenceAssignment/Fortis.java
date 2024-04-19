package InheritenceAssignment;

public class Fortis extends Hospital {
	
	public void nurologyTreatment() {
		System.out.println("Fortis------Neurology ");
	}
	@Override
	public void generalTreatment() {
		System.out.println("Fortis-----GeneralTreatment");
	}
	@Override
	public void bill() {
		System.out.println("Fortis-----bill");
	}
}
