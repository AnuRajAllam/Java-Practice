package Interface_Assignment;

public class XaviersCollege extends University implements USEducation,UKEducaiton,IndianEducation{
	
	public  void BscCourse() {
		System.out.println("XaviersCollege-----------BscCourse");
		UKEducaiton.marks();
	    Strength();
	   
	
	}
	
	public void bioTechCourse() {
		System.out.println("XaviersCollege-----------bioTechCourse");
	}
	@Override
	public void boardExams() {
		System.out.println("XaviersCollege-----------BoardExams");
	}

	@Override
	public void medicalCourses() {
		System.out.println("XaviersCollege-----------medicalCourses");		
	}

	@Override
	public void feeStructure() {
		System.out.println("XaviersCollege-----------feeStructure");		
	}

	@Override
	public void engineeringCourses() {
		System.out.println("XaviersCollege-----------engineeringCourses");		
	}

	@Override
	public void diplomaCourses() {
		System.out.println("XaviersCollege-----------diplomaCourses");		
	}

}
