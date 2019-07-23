package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;
import entities.Individual;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();

		for (int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();

				list.add(new Individual(name, annualIncome, healthExpenses));

			} else if (ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Annual income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();

				list.add(new Company(name, annualIncome, numberEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;

		for (TaxPayer y : list) {
			double tax = y.calculateTaxes();
			System.out.println(y.getName() + ": $ " + String.format("%.2f", y.calculateTaxes()));
			sum += tax;
		}

		System.out.println();

		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
