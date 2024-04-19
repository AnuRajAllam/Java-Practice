package InheritenceAssignment;

public class University extends WEO {
	
	public void projects() {
		System.out.println("University-------projets");
	}

	public void labExams() {
		System.out.println("University-------LabExmas");
	}
	

	@Override
	public void feeStructure() {
		System.out.println("University-------feeStructure");
	}
}
