package InheritenceAssignment;

public class XaviersCollege extends University {
	
	public void phd() {
		System.out.println("XaviersCollege-------phd");
	}
	
	public void Bcom() {
		System.out.println("XaviersCollege-------Bcom");
	}
	public void Bsc() {
		System.out.println("XaviersCollege-------Bsc");
	}
	
	@Override
	public void feeStructure() {
		System.out.println("XaviersCollege-------feeStructure");
	}

}
