package programmingProblems;

public class Reverseastring {

	public static void main(String[] args) {
		String originalStr = "ollo";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: " + reversedStr);
		if (originalStr.compareTo(reversedStr) == 0) {
			System.out.println("The Given String is Palindrome String..");

		} else
			System.out.println("The Given String is Not Palindrome String..");
	}

}
