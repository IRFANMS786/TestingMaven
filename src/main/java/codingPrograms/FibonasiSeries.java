package codingPrograms;

import java.util.Scanner;

public class FibonasiSeries {
	public static void main(String[] args) {
		int n, a = 0, b = 1, c;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number to print the Fiboniciss of Numbers.....");
			n = s1.nextInt();
			for (int i = 0; i <= n; i++) {
				c = a + b;
				System.out.println(+c);
				a = b;

				b = c;

			}

		}
	}

}
