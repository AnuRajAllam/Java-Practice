package Oop_Encapsulation;

public class EmployeeTest {

	
//	dsaAS
	public static void main(String[] args) {
		
		Employee e1=new Employee("anu",33,18);
		
		
		
		
		System.out.println(e1.getNam()+" "+e1.getAge()+" "+e1.getSalary());
		e1.setAge(34);
		e1.setSalary(20.33);
		System.out.println(e1.getNam()+" "+e1.getAge()+" "+e1.getSalary());
		Employee e2=new Employee("Raju",40,56);
		System.out.println(e2.getNam()+" "+e2.getAge()+" "+e2.getSalary());
		
		
		Browser b=new Browser();
		b.launchBrowser();
		
		LoginPage lp=new LoginPage("anusha", "nu123");
		lp.doLogin();
		lp.setPwd("anu456");
		lp.doLogin();
	
	}

}
