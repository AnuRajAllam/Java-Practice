package InheritenceAssignment;

public class EducationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent class of all the clases
		WEO obj=new WEO();
		obj.boardExams();//individual
		obj.engineringCourses();//individual
		obj.medicalCourses();//individual
		obj.feeStructure();//individual
		System.out.println("----------------------");
		//child class of weo and parent class for all other
		University uniObj=new University();
		uniObj.projects();//individual
		uniObj.feeStructure();//overriden
		uniObj.boardExams();//Inherited
		System.out.println("----------------------");
		IITCollege iitObj=new IITCollege();
		iitObj.engineringCourses();//Overriden from Grandparent
		iitObj.boardExams();//Inherited form Grandparent
		iitObj.MechanicalEngineering();//individual
		iitObj.feeStructure();//Overriden
		iitObj.projects();//inherited
		System.out.println("----------------------");
		IIMCollege iimObj=new IIMCollege();
		iimObj.medicalCourses();//Overriden from Grandparent
		iimObj.boardExams();//Inherited form Grandparent
		iimObj.Mbbs();//individual
		iimObj.feeStructure();//Overriden
		iimObj.labExams();//inherited
		System.out.println("----------------------");
		XaviersCollege xObj=new XaviersCollege();
//		xObj.medicalCourses();//Overriden from Grandparent
		xObj.boardExams();//Inherited form Grandparent
		xObj.Bcom();//individual
		xObj.feeStructure();//Overriden
		xObj.labExams();//inherited
		
		System.out.println("--------------------");
		//TOp casting
		
		University uObj1=new XaviersCollege();
		uObj1.boardExams();//inherited
		uObj1.feeStructure();//overriden
		uObj1.projects();//individual
		uObj1.medicalCourses();//inherited
		
		System.out.println("--------------------");
		University uObj2=new IIMCollege();
		uObj2.boardExams();//inherited
		uObj2.feeStructure();//overriden
		uObj2.projects();//individual
		uObj2.medicalCourses();//overriden
		
		System.out.println("--------------------");
		WEO wObj=new IITCollege();
		wObj.boardExams();//individual
		wObj.feeStructure();//overriden
        wObj.medicalCourses();//individual
        
       // down casting
        
        //XaviersCollege xobj1=new University();Type mismatch exception
        
      //  XaviersCollege xobj1=(XaviersCollege)new University();
       // xobj1.Bcom();//class cast exception
        
		
	

		



	}

}
