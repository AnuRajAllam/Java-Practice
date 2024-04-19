package javasessions;

public class StaticMethodConcept {
	
	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("Get Info");
	}

	public void sendEmail() {
		System.out.println("send email");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call static methods and variables using class name.
				StaticMethodConcept.name="Tom";
		StaticMethodConcept.getInfo();
		
		//call non static methods by creating obj
		StaticMethodConcept obj=new StaticMethodConcept();
		obj.age=10;
		obj.sendEmail();
		
		
		
		

	}

}
