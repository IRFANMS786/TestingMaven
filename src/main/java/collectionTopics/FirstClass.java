package collectionTopics;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit to find....");
		String enterfruit = sc.nextLine();
		System.out.println("Entered fruit is ...." + enterfruit);

		for (String fruit : list) {
			if (enterfruit.equals(fruit)) {
				System.out.println(fruit);
				break;
			}else
				System.out.println(enterfruit+" Fruit is not present...");
			break;
		}

	}

}
