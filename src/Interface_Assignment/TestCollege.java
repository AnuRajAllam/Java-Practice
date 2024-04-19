package Interface_Assignment;

public class TestCollege {

	public static void main(String[] args) {
		University u=new University();
		u.boardExams();//indivi
		u.labExams();//indiv
		u.projects();//indivi
	
		System.out.println("-----------");
		University u1=new IIITCollege();
		u1.boardExams();
		u1.labExams();
		u1.projects();
		System.out.println("-----------");
		IIITCollege i=new IIITCollege();
		System.out.println(i.totalSems=4);
		System.out.println(i.fees);
		i.boardExams();
		i.feeStructure();
		i.MBACourse();
		i.MCACourse();
		i.engineeringCourses();
		i.diplomaCourses();
		i.labExams();
		System.out.println("-----------");
		UKEducaiton ukObj=new IIITCollege();
		ukObj.boardExams();
		ukObj.engineeringCourses();
		ukObj.feeStructure();
		ukObj.medicalCourses();
		ukObj.Strength();
		UKEducaiton.marks();
		System.out.println("-----------");
		IndianEducation indObj=new IIITCollege();
		indObj.boardExams();
		indObj.diplomaCourses();
		indObj.medicalCourses();
		indObj.feeStructure();
		indObj.engineeringCourses();
		System.out.println("-----------");
		USEducation usObj=new XaviersCollege();
		usObj.boardExams();
		usObj.engineeringCourses();
		usObj.medicalCourses();
		usObj.feeStructure();
		
		
		
	}

}
