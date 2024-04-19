package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=null;
		try {
		if(name==null) {
			System.out.println("DataNotFound");
			throw new Exception("DataNotFound");}
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
