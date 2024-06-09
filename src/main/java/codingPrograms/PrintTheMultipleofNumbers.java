package codingPrograms;

import java.util.Scanner;

public class PrintTheMultipleofNumbers {

	public static void main(String[] args) {
		int n;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number to print the Multiple of Numbers.....");
			n = s1.nextInt();
		}
		System.out.println("Series of Number upto N is....");
		for (int i = 1; i <= n; i++) {

			System.out.println(i);
		}
		System.out.println("Multiple of 2 is....");
		for (int i = 1; i <= n; i++) {

			System.out.println(i * 2);

		}
		System.out.println("Multiple of 3 is....");
		for (int i = 1; i <= n; i++) {

			System.out.println(i * 3);

		}
		System.out.println("Multiple of 4 is....");
		for (int i = 1; i <= n; i++) {

			System.out.println(i * 4);

		}

	}

}
