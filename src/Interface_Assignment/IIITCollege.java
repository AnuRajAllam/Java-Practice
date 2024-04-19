package Interface_Assignment;

public class IIITCollege extends University implements USEducation,UKEducaiton,IndianEducation{
	
	int totalSems;
	
	public void MCACourse() {
		System.out.println("IIITCollege--------MCACourse");
	}
	
	public void MBACourse() {
		System.out.println("IIITCollege--------MBACourse");
	}
	
		
	@Override
	public void medicalCourses() {
		System.out.println("IIITCollege-----------medicalCourses");		
	}

	@Override
	public void boardExams() {
		System.out.println("IIITCollege-----------boardExams");		
	}

	@Override
	public void feeStructure() {
		System.out.println("IIITCollege-----------feeStructure");		
	}

	@Override
	public void engineeringCourses() {
		System.out.println("IIITCollege-----------engineringCourses");		
	}

	@Override
	public void diplomaCourses() {
		System.out.println("IIITCollege-----------diplomaCourses");		
	}

}
