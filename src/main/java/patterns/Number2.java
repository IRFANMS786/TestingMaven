package patterns;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {

		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number to Build the Pattern of Stars  ****");
			int n = s1.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}

	}

}
