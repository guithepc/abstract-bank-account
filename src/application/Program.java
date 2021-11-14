package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account acc1 = new BusinessAccount(8779, "Guilherme", 800000.00, 20000.00);
		Account acc2 = new SavingsAccount(9989, "Nicole", 76500.00, 0.03);
		
		List<Account> list = new ArrayList<>();
		
		list.add(acc1);
		list.add(acc2);
		
		double sum = 0;
		for (Account account : list) {
			sum += account.getBalance();
		}

		System.out.println("Total balance: " + sum);
		
		for (Account account : list) {
			account.deposit(50);
		}
		
		for (Account account : list) {
			System.out.println("Updated value : " + account.getNumber() + ", $" + account.getBalance());
		}
		
		
		
	}
}
