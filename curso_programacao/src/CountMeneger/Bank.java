package CountMeneger;

public class Bank {

	private int numberAccount;
	private double balance;
	private String name;
	
	public Bank(int numberAccount,String name,double balance) {
		this.name = name;
		this.balance = balance;
		this.numberAccount = numberAccount;
		
	}
	
	public Bank(int numberAccount,String name) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public void withdrawal(double value) {
		balance -= value;
	}

	public void doposit(double value) {
		balance += value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
}
