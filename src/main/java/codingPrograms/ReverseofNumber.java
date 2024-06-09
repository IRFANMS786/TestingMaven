package codingPrograms;

import java.util.Scanner;

public class ReverseofNumber {
	public static void main(String[] args) {
		int n, originalNumber, reverse = 0, rem;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number to Reversed.....");
			n = s1.nextInt();
			originalNumber = n;
			while (n != 0) {
				rem = n % 10;
				reverse = reverse * 10 + rem;
				n = n / 10;
			}
			System.out.println("Original Number is..." + originalNumber);
			System.out.println("Reverse Number is..." + reverse);
			if (originalNumber == reverse) {
				System.out.println("It is Palindrome Number");
			} else {
				System.out.println("It is not a Palindrome Number");
			}
		}

	}

}
