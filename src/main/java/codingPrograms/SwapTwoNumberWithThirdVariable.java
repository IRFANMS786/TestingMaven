package codingPrograms;

import java.util.Scanner;

public class SwapTwoNumberWithThirdVariable {

	public static void main(String[] args) {
		int a, b, temp = 0;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the First Number");
			a = s1.nextInt();
			System.out.println("Enter the Second Number");
			b = s1.nextInt();
		}
		temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers after Swapping...." + a + " " + b);

	}

}
