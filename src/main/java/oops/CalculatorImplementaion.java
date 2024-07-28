package oops;

public class CalculatorImplementaion implements Calculator {

	@Override
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The Addition of two Numbers.." + c);

	}

	@Override
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("The Subraction of two Numbers.." + c);
	}

	@Override
	public void mult(int a, int b) {
		int c = a * b;
		System.out.println("The Multiplication of two Numbers.." + c);

	}

	@Override
	public void div(int a, int b) {
		int c = a / b;
		System.out.println("The Divison of two Numbers.." + c);

	}

	@Override
	public void mod(int a, int b) {
		int c = a % b;
		System.out.println("The Mod of two Numbers.." + c);

	}

}
