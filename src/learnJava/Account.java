package learnJava;

public class Account {
	
	String info;
	static double bal;
	static double deposit;
	static double withdraw;
	static double transaction;

	public Account(String info, double bal) {
		this.info = info;
		this.bal = bal;
		
	}

	public static void main(String[] args) {
		
		Account myAccount = new Account("My Account's balance is: ", 100.0);
		
		System.out.println("Initial State");
		System.out.println(myAccount.info+ myAccount.bal);
		
		
		
		
		myAccount.deposit(20.0);
		System.out.println("My account balance is now: "+myAccount.balance());
		
		
		myAccount.withdraw(20.0);
		
		System.out.println("My account balance is now: "+myAccount.balance());
		
		System.out.println("End State");
		System.out.println(myAccount.info+ myAccount.bal);
		

	}
	
	public double deposit(double dep) {
		deposit=dep;
		return deposit;
		
	}
	public double balance() {
		bal+=deposit;
		return bal;
		
	}
	public double withdraw(double w) {
		withdraw = w;
		return withdraw;
		
	}
	

}
