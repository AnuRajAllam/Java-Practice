package InheritenceAssignment;

public class IITCollege extends University {
	
	public void MechanicalEngineering() {
		
		System.out.println("IIT------MechanicalEngineering");
	}

	public void compuerScience() {
		System.out.println("IIT------compuerScience");

	}
	
	public void ECE() {
		System.out.println("IIT------ECE");

	}
	
	@Override
	public void feeStructure() {
		System.out.println("IITCollege-------feeStructure");
	}
	@Override
	public void engineringCourses() {
		System.out.println("IITCollege------enginering Courses ");
	}

}
