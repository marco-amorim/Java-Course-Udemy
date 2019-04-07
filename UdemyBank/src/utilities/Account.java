package utilities;

public class Account {

	private String accountHolder;
	private int accountNumber;
	private double initialDeposit, balance;

	public Account(String accountHolder, int accountNumber, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
		/*
		 * Puxa o método deposit com o depósito inicial, para ter um controle de
		 * negócios muito melhor e considerar o initialDeposit um depósito normal.
		 */
	}

	public Account(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}

	public void deposit(double depositAmount) {

		balance += depositAmount;
	}

	public void withdraw(double withdrawAmount) {

		balance -= (withdrawAmount + 5.00);
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public double getBalance() {

		return balance;

	}

	public String toString() {

		return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
