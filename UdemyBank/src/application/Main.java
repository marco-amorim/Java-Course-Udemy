package application;

import java.util.Scanner;

import utilities.Account;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account acc;
		int accountNumber;
		double initialDeposit = 0;
		String accountHolder;

		System.out.println("Enter account number: ");
		accountNumber = input.nextInt();
		input.nextLine();
		System.out.println("Enter account holder: ");
		accountHolder = input.nextLine();

		System.out.println("Is there a initial deposit (y/n)? ");

		if (input.nextLine().equalsIgnoreCase("y")) {

			System.out.println("Enter initial deposit value: ");
			initialDeposit = input.nextDouble();

			acc = new Account(accountHolder, accountNumber, initialDeposit);

		} else {

			acc = new Account(accountHolder, accountNumber);
		}

		System.out.println();

		System.out.println("Account data: ");
		System.out.println(acc);

		System.out.println();

		System.out.println("Enter a deposit value: ");
		double deposit = input.nextDouble();

		acc.deposit(deposit);

		System.out.println("Updated account data: ");
		System.out.println(acc);

		System.out.println();

		System.out.println("Enter a withdraw value: ");
		double withdraw = input.nextDouble();

		acc.withdraw(withdraw);

		System.out.println("Updated account data: ");
		System.out.println(acc);

		System.out.println(acc.getBalance());

		input.close();

	}

}