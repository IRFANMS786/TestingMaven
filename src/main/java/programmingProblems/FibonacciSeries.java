package programmingProblems;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1, c;

		System.out.println("Enter the Count to be perform Fibonosis Series operation ");
		Scanner s1 = new Scanner(System.in);
		int count = s1.nextInt();
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <= count; i++) {
			c = a + b;
			System.out.println("" + c);

			b = c;
			a = b;

		}

	}

}
