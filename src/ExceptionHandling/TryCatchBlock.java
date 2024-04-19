package ExceptionHandling;

public class TryCatchBlock {
	String Name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			TryCatchBlock obj=new TryCatchBlock();
			obj=null;
			obj.Name="Anu";
			
		int i=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		System.out.println("Bye");

	}

}
