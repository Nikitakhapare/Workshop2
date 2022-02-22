package Bridgelabz.workshop2;

public class SavingAccount {
public static void main(String [] args) {
	Account saver1=new Account(1500);
	Account saver2=new Account(4000);
	saver1.monthlyIntrestRate();
	saver2.monthlyIntrestRate();
	saver1.display();
	saver2.display();
}
}
