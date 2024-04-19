package InterfaceConcept;

public interface USMedical extends WHO {
	
	int min_fee=10;
	
	public void physioServices();
	
	public void onocologyServices();
	
	public void pediaServices();
	
	public void emergencySevices();
	
	//After jdk1.8 we have two major changes
	//1. we can have static method with method body
	public static void billing() {
		System.out.println("USMedical-------billing");
	}
	//2. we can have a default method with method body
	default void medicalInsurance() {
		System.out.println("USMedical--------medicalInsurance");
	}

}
