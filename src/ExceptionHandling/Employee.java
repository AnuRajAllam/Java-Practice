package ExceptionHandling;

public class Employee {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException{
		System.out.println("m3");
		int i = 9 / 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Employee();

		obj.m1();

		System.out.println("bye");
	}

}
