package programmingProblems;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number to check whether it is Palindrome Number or Not");
			int rev = 0;

			int num = s1.nextInt();
			int original = num;
			while (num > 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;

			}
			System.out.println("Reverse of a Number.." + rev);
			if (rev == original) {
				System.out.println("The Given Number is Palindrome Number..");

			} else
				System.out.println("The Given Number is  not Palindrome Number..");
		}

	}

}
