package collectionTopics;

import java.util.ArrayList;

public class SetandGet {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println(list);
		System.out.println("First Element is.." + list.get(0));
		list.set(0, "Avacado");
		System.out.println("New Fruits after Changes..........");
		for (String printFruit : list) {
			System.out.println(printFruit);
		}
	}

}
