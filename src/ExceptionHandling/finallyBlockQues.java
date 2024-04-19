package ExceptionHandling;

public class finallyBlockQues {
	
	public static int  getMarks(String studentName) {
		
		System.out.println("StudentName is"+studentName);
		
		if(studentName.equals("rahul")) {
			try {
				int i=9/0;
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("IN finally block");
			}
			return 90;
		}
		else if(studentName.equals("rahul")) {
			return 95;
		}
		else if(studentName.equals("naveen")) {
			return 10;
		}
		else {
			System.out.println("Please enter correct name");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMarks("rahul");

	}

}
