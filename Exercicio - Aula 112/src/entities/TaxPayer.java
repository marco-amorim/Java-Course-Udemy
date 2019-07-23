package entities;

public abstract class TaxPayer {

	private String name;
	private double annualEarnings;

	public TaxPayer() {

	}

	public TaxPayer(String name, double annualEarnings) {
		this.name = name;
		this.annualEarnings = annualEarnings;
	}

	public abstract double calculateTaxes();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualEarnings() {
		return annualEarnings;
	}

	public void setAnnualEarnings(double annualEarnings) {
		this.annualEarnings = annualEarnings;
	}

}
