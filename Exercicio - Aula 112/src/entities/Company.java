package entities;

public class Company extends TaxPayer {

	private int numberEmployees;

	public Company() {
	}

	public Company(String name, double annualEarnings, int numberEmployees) {
		super(name, annualEarnings);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double calculateTaxes() {
		if (this.getNumberEmployees() <= 10) {
			return (this.getAnnualEarnings() * 0.16);
		} else {
			return (this.getAnnualEarnings() * 0.14);
		}
	}

}
