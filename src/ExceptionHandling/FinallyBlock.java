package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=9/0;
			System.out.println("selnium");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("im in finally block");
		}

	}

}
