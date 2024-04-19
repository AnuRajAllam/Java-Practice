package BuilderPattern;

public class Registration {
	
	String name;
	
	String pwd;
	String tel;
	
	public void userReg(String name,String pwd,String tel) {
		System.out.println("User name is: "+name);
		System.out.println("Password is: "+pwd);
		System.out.println("Telephone is: "+tel);
		this.name=name;
		this.pwd=pwd;
		this.tel=tel;
	}
	public void printInfo() {
		System.out.println(name+" "+pwd+" "+tel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration obj=new Registration();
		obj.userReg("anu", "anu123", "999999");
		obj.printInfo();

	}

}
