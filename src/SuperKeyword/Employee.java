package SuperKeyword;

public abstract class Employee {
	
	int age=30;
	String name="Test";
	
	public Employee() {
		System.out.println("Employee---cons");
	}
	
	public void salary() {
		System.out.println("Employee--salary");
	}
	
	public static void qualification() {
		System.out.println("Employee---qualification");
	}
	
	public final void Loc() {
		System.out.println("Employee----Loc");
	}

	public abstract void role(); 
}
