package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double valorDolar, qntdDolar;

		System.out.println("Qual o preço atual do dólar?");
		valorDolar = input.nextDouble();

		System.out.println("Quantos dólares serão comprados?");
		qntdDolar = input.nextDouble();

		System.out.println(
				String.format("Valor da compra em reais: %.2f", CurrencyConverter.calculoPreco(valorDolar, qntdDolar)));

		input.close();

	}

}
