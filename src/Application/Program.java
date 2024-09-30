package Application;


import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import exeptions.DomainException;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		
		
		try {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt(); 
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		
		Account acc = new Account(number, holder, balance, limit);
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("New balance: " + String.format("%.2f",acc.getBalance()));
		
		sc.close();
		}
		
		catch (DomainException e) {
			System.out.println("withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
	}

}
