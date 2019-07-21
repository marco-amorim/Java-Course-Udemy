package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, Date manufactureData) {
		super(name, price);
		this.manufactureDate = manufactureData;
	}

	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + String.format("%.2f", this.getPrice()) + " (Manufacture date: "
				+ sdf.format(this.getManufactureDate()) + ")";
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureData(Date manufactureData) {
		this.manufactureDate = manufactureData;
	}

}
