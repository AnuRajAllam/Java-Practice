package BuilderPattern;

public class EcommApplication {
	
	public EcommApplication login(String Un,String pwd) {
		System.out.println("Logged in with: "+Un+pwd);
		return this;
	}
	public EcommApplication login(String Un,String pwd,String role) {
		System.out.println("Logged in with: "+Un+pwd+role);
		return this;
	}
	public EcommApplication search(String ProductName,String color,int price) {
		System.out.println("searched in with: "+ProductName+color+price);
		return this;
	}
	public EcommApplication search(String ProductName,String color) {
		System.out.println("searched in with: "+ProductName+color);
		return this;
	}
	public EcommApplication addToCart(String ProductName) {
		System.out.println("Added to cart: "+ProductName);
		return this;
	}
	public EcommApplication payment(String upi) {
		System.out.println("Paid using"+upi);
		return this;
	}
	public EcommApplication payment(String cc,int cv) {
		System.out.println("Paud using"+cc+cv);
		return this;
	}
	public EcommApplication getOrderid() {
		System.out.println("Got the orderid");
		return this;
	}
	public EcommApplication logOut() {
		System.out.println("loggedOut");
		return this;
	}

}
