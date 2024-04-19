package javasessions;

public class FinalKeyword {
	
	static final int i=10;
	final int  num=20;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i=10;//local variables cannot be static
		System.out.println(i);
		System.out.println(FinalKeyword.i);
		FinalKeyword obj=new FinalKeyword();
		System.out.println(obj.num);
		//i=20;
		final int DAYS_IN_WEEK=7;
		int sal=DAYS_IN_WEEK*100;
		System.out.println(sal);

	}

}
