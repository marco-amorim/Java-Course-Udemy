package application;

import javax.swing.JOptionPane;

import utilities.Account;

public class Main {

	public static void main(String[] args) {

		Account acc;
		int accountNumber;
		double initialDeposit = 0;
		String accountHolder, initialDPBoolean;

		accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number: "));

		accountHolder = JOptionPane.showInputDialog("Enter account holder: ");

		initialDPBoolean = JOptionPane.showInputDialog("Is there a initial deposit (y/n)? ");

		if (initialDPBoolean.equalsIgnoreCase("y")) {

			initialDeposit = Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));

			acc = new Account(accountHolder, accountNumber, initialDeposit);

		} else {

			acc = new Account(accountHolder, accountNumber);
		}

		JOptionPane.showMessageDialog(null, "Account data: " + "\n" + acc);

		double deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value: "));

		acc.deposit(deposit);

		JOptionPane.showMessageDialog(null, "Updated account data: " + "\n" + acc);

		double withdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value: "));

		acc.withdraw(withdraw);

		JOptionPane.showMessageDialog(null, "Updated account data: " + "\n" + acc);

	}

}