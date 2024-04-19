package Oop_Encapsulation;

public class BankAccount {
	private String accountNum;
	private double balance;
	private String owner;
	

	public String getAccountNum() {
		return accountNum;
	}


	public double getBalance() {
		return balance;
	}


	public String getOwner() {
		return owner;
	}


	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}
	

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Total balance after deposit is: " + this.balance);
		
	}

	public void withdraw(double amount) {
		this.balance= this.balance - amount;
		System.out.println("Total balance after withdrawl is: " + this.balance);
	}
	
	public void printInfo() {
		System.out.println("Owner name is: "+ this.owner+" "+"Account num is: "+this.accountNum+" "+
	"total balance is: "+this.balance);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba=new BankAccount();
		ba.setAccountNum("1234567");
		ba.setBalance(4000);
		ba.setOwner("Anusha");
		ba.deposit(2000);
		ba.withdraw(1000);
		ba.printInfo();

	}

}
