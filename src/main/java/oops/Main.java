package oops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CalculatorImplementaion c1 = new CalculatorImplementaion();

		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("ENter the two Number");
			int a = s1.nextInt();
			int b = s1.nextInt();
			c1.add(a, b);
			c1.sub(a, b);
			c1.mult(a, b);
			c1.div(a, b);
			c1.mod(a, b);
		}
	}

}
