package entities;

public class Individual extends TaxPayer {

	private double healthExpenses;

	public Individual() {

	}

	public Individual(String name, double annualEarnings, double healthExpenses) {
		super(name, annualEarnings);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double calculateTaxes() {

		if (this.getAnnualEarnings() < 20000.00) {
			return (this.getAnnualEarnings() * 0.15) - (this.getHealthExpenses() * 0.5);
		} else {
			return (this.getAnnualEarnings() * 0.25) - (this.getHealthExpenses() * 0.5);
		}
	}

}
