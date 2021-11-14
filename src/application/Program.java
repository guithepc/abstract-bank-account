package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account acc = new Account(1000, "Alex", 0.0);
		
		BusinessAccount ba = new BusinessAccount(1001, "Pietro", 0.0, 5000.0);
		
		SavingsAccount sa = new SavingsAccount(687, "Guilherme", 0.0, 0.03);
		
		sa.withdraw(50);
		
		acc.withdraw(50);
		
		ba.withdraw(200);
		
		System.out.println(acc.getBalance());
		
		System.out.println(sa.getBalance());
		
		System.out.println(ba.getBalance());
		
	}
}
