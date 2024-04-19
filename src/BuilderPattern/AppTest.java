package BuilderPattern;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcommApplication obj=new EcommApplication();
		obj.login("Anusha", "anu123")
		.search("T-shirt", "black")
		.addToCart("t-shirt")
		.payment("hdfc")
		.getOrderid()
		.logOut();
		
		//another transaction
		obj.login("Anusha", "anu123")
		.search("samsung mobile", "black")
		.logOut();
		
		//another
		obj.login("Anusha", "anu123");
		
		//another
		obj.logOut();
		//another
		obj.login("Anusha", "anu123")
		.search("T-shirt", "black")
		.search("mac book pro", "white")
		.search("laptop", "silver")
		.logOut();
		
		

	}

}
