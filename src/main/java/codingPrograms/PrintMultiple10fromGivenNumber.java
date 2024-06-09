package codingPrograms;

import java.util.Scanner;

public class PrintMultiple10fromGivenNumber {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int n = s1.nextInt();
			for (int i = 1; 1 <= n; i++) {
				if (i % 10 == 0) {
					System.out.println(i);
				}

			}

		}

	}
}
