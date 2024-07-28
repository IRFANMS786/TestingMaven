package programming_Problems;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int number, fact = 1;
		System.out.println("Enter the Count to be perform Factortial operation ");
		Scanner s1 = new Scanner(System.in);
		number = s1.nextInt();
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of a number is..." + fact);

	}

}
