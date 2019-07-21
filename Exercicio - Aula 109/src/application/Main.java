package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();

		for (int i = 1; i <= numberProducts; i++) {

			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				list.add(new ImportedProduct(name, price, customsFee));
			} else if (ch == 'c') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();

				list.add(new Product(name, price));
			} else if (ch == 'u') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYY): ");
				Date manufactureDate = sdf.parse(sc.next());

				list.add(new UsedProduct(name, price, manufactureDate));
			}
		}

		System.out.println();

		System.out.println("PRICE TAGS: ");
		for (Product x : list) {

			System.out.println(x.priceTag());

		}

		sc.close();
	}

}
