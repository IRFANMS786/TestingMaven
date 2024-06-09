package codingPrograms;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a, b, temp = 0;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the First Number");
			a = s1.nextInt();
			System.out.println("Enter the Second Number");
			b = s1.nextInt();
			System.out.println("Numbers Before Swapping  " + a + "  " + +b);
		}
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Numbers After Swapping   " + a + "  " + +b);

	}

}
