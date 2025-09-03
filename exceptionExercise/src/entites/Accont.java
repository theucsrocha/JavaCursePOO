package entites;

import exceptions.DomainException;

public class Accont {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	public Accont(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("Withdrawal limit exceeded");
		}
		else if(amount > balance) {
			throw new DomainException("Insufficient Balance!");
		}
		balance -= amount;
	}
	@Override
	public String toString() {
		return "Accont [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}
	
	
	
}
