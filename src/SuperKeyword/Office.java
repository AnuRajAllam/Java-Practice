package SuperKeyword;

public class Office extends Employee{
	
	public Office() {
		super();
		System.out.println("Office----const");
		
	}
	
	public Office(int i) {
		System.out.println("Office----const"+i);
	}

	@Override
	public void role() {
		System.out.println("Office----role");		
	}
	
	public void totalEmplo() {
		super.qualification();
		super.Loc();
		this.role();
		System.out.println(super.age);
		System.out.println(super.name);
		System.out.println("Office----totalEmplo");
	}

}
