package utilities;

public class CurrencyConverter {

	public static double calculoPreco(double valorDolar, double qntdDolar) {

		return (valorDolar * qntdDolar) + (valorDolar * qntdDolar) / 100 * 6.0;

	}

}
