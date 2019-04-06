package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio:");

		double raio = input.nextDouble();

		double c = Calculator.circunferencia(raio);

		double v = Calculator.volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do Pi: %.2f%n", Calculator.PI);

		input.close();
	}

}
