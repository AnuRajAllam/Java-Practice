package InheritenceAssignment;

public class IIMCollege extends University {
	
	
	public void Mbbs() {
		System.out.println("IIMCollege-------Mbbs");
	}
	
	public void BDS() {
		System.out.println("IIMCollege-------BDS");
	}
	
	public void Nursing() {
		System.out.println("IIMCollege-------Nursing");
	}
	
	@Override
	public void feeStructure() {
		System.out.println("IIMCollege-------feeStructure");
	}
	
	@Override
	public void medicalCourses() {
		System.out.println("IIMCollege------medical Courses ");
	}
}
