package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please insert the amount of heights: ");

		int N = input.nextInt();

		double[] vector = new double[3];

		int i = 0;

		for (i = 0; i < N; i++) {

			System.out.println("Height number " + (i + 1) + ":");
			vector[i] = input.nextDouble();
		}

		double sum = 0.0;

		for (i = 0; i < N; i++) {

			sum += vector[i];
		}

		double average = 0.0;

		average = sum / N;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", average);

		input.close();
	}

}
