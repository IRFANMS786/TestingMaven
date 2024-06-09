package basics;

import java.util.Scanner;

public class Subraction {
	public static void main(String[] args) {
		int a, b, sum;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter First  the Number");

			a = s1.nextInt();
			System.out.println("Enter Second  the Number");

			b = s1.nextInt();
		}
		sum = a - b;
		System.out.println("The Substaction of two Number is...." + sum);
	}

}
