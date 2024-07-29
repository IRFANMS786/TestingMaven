package programming_Problems;

import java.util.Scanner;

public class Reverseastring {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("The Enter the  String To check  Palindrome String or Not ..");
		String originalStr = s1.nextLine();
//		String originalStr = "ollo";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
			System.out.println(reversedStr);
		}
		System.out.println("Orignial string: " + originalStr);
		System.out.println("Reversed string: " + reversedStr);
		if (originalStr.compareTo(reversedStr) == 0) {
			System.out.println("The Given String is Palindrome String..");

		} else
			System.out.println("The Given String is Not Palindrome String..");
	}

}
