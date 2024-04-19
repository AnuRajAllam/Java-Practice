package Interface_Assignment;

public interface UKEducaiton extends WEO {
	
	public void feeStructure();
	
	public void medicalCourses();
	
	public static void marks() {
		System.out.println("UKEducaiton------marks");
	}
	
	default void Strength() {
		System.out.println("UKEducaiton------Strength");
	}

}
