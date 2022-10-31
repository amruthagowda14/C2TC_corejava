package javaProject;

public abstract class SavingsAccount extends BankAccount {
	public SavingsAccount(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}
	private boolean isSalaried;
	private float MINBAL;
	public abstract float withdraw();
	public abstract String toString();
}
