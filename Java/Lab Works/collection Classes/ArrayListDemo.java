package sdmcet.cse.oop.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(3);

		// To display the size of the ArrayList
		System.out.println("Intial size: " + al.size());

		// To the add the elements in the ArrayList
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("JavaScript");
		// Can't see the current capacity
		System.out.println("Intial size: " + al.size());
		al.add("React.js");
		al.add("Django");
		System.out.println("Intial size: " + al.size());

		// to print the elements as list

		System.out.println("\nThe ArrayList elements as a List: " + al);

		// to print the elements using iterator (Preffered)
		Iterator<String> itr = al.iterator();
		System.out.println("\nThe ArrayList elements using iterator: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// to print the elements using ForEach styled Loop
		System.out.println("\nThe ArrayList elements using ForEach styled Loop: ");
		for (String str : al) {
			System.out.println(str);
		}

		// To delete elements
		al.remove("C++");
		al.remove(1);
		System.out.println("\nThe ArrayList elements as a List: " + al);

		// If element not found when passed a String it ignores the remove statement
		al.remove("C+");

		// If element is not found when passed with a index it throws an exception
		try {
			al.remove(6);
		} catch (IndexOutOfBoundsException iob) {
			System.out.println("\n!!!EXCEPTION: Element not found at index..!");
		}
	}

}
