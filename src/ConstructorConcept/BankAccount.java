package ConstructorConcept;

public class BankAccount {

	String accountNum;
	double balance;

	public BankAccount(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public void deposit(double amount) {
		double totalBal = this.balance + amount;
		System.out.println("Total balance after deposit is: " + totalBal);
	}

	public void withdraw(double amount) {
		double totalBal = this.balance - amount;
		System.out.println("Total balance after withdrawl is: " + totalBal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("123343545", 3000);
		System.out.println("total balance in AccNum "+ ba.accountNum+" is "+ba.balance);
		ba.deposit(1000);
		ba.withdraw(500);
		ba.deposit(200);
		ba.deposit(400);
		ba.withdraw(200);
	}

}
