package codingPrograms;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		int n = 0;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the Number to find Even or Odd");
			n = s1.nextInt();
		}
		if (n % 2 == 0) {
			System.out.println("Entered Number is Even .....");
		} else {
			System.out.println("Entered Number is Odd .....");
		}

	}

}
