package Bridgelabz.workshop2;

public class Account {
	private static double annualIntrestRate=4;
	private double savingBalance=0;
	double balance;
	double monthlyInterestRate;
	public Account(double balance) {
		this.savingBalance = balance;
	}
	public static double getAnnualIntrestRate() {
		return annualIntrestRate;
	}
	public static void setAnnualIntrestRate(double annualIntrestRate) {
		Account.annualIntrestRate = annualIntrestRate;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double Balance) {
		this.savingBalance = Balance;
	}
	public void monthlyIntrestRate() {
		monthlyInterestRate=savingBalance*(annualIntrestRate/12);
	}
	public void display() {
		System.out.println("MonthlyIntrest= "+monthlyInterestRate);
	}

}
