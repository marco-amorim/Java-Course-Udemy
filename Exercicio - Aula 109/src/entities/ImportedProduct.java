package entities;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return this.getName() + " $ " + String.format("%.2f", this.totalPrice()) + " (Customs fee: $ "
				+ String.format("%.2f", this.getCustomsFee()) + ")";
	}

	public double totalPrice() {
		return this.getPrice() + this.getCustomsFee();
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

}
