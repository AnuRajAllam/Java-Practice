package SuperKeyword;

public class Hospital implements Medical {
	
	int min_fee=50;
	
	public void treatment()
	{
		System.out.println(min_fee);
		covid();
		Medical.testing();
		bloodTest();
	}

	@Override
	public void covid() {
		System.out.println("Hospital----covid");		
	}
}
