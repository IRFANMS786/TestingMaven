package programming_Problems;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Enter the number to be Calculate...");
		a = s1.nextInt();
		b = s1.nextInt();
		System.out.println("Choose operator to perform operations +,-,*,/,%");
		char ch;
		ch = s1.next().charAt(0);
		switch (ch) {
		case '+':
			System.out.println("The Addition of two Number.." + (a + b));
			break;
		case '-':
			System.out.println("The Subraction of two Number.." + (a - b));
			break;
		case '*':
			System.out.println("The Multiplication of two Number.." + (a * b));
			break;
		case '/':
			System.out.println("The Divison of two Number.." + (a / b));
			break;
		case '%':
			System.out.println("The Divison of two Number.." + (a % b));
			break;
		default:
			System.out.println("Invalid opertion");
		}

	}

}
