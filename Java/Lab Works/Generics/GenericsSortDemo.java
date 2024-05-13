package sdmcet.cse.oop.generics;

import java.util.Arrays;

public class GenericsSortDemo {

	// Syntax to create Generics method that any type of the dataType
	public <T extends Comparable<T>> void sort(T a[]) {

		for (int i = 0; i < a.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[smallest]) <= 0) {
					smallest = j;
				}
			}
			swap(a, i, smallest);
		}
	}

	private <T> void swap(T a[], int i, int smallest) {
		if (i != smallest) {
			T temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
	}

	public static void main(String[] args) {

		GenericsSortDemo gs = new GenericsSortDemo();

		Integer a[] = { 4, 12, 3, 2 };
		System.out.println("Before Sort : " + Arrays.toString(a));
		gs.sort(a);
		System.out.println("After Sort : " + Arrays.toString(a));

		Double d[] = { 4.2, 12.01, 3.95, 2.2 };
		System.out.println("Before Sort : " + Arrays.toString(d));
		gs.sort(d);
		System.out.println("After Sort : " + Arrays.toString(d));

		String s[] = { "hi", "hello", "bye", "apple" };
		System.out.println("Before Sort : " + Arrays.toString(s));
		gs.sort(s);
		System.out.println("After Sort : " + Arrays.toString(s));

		Character c[] = { 'a', 'i', 'm', 'b' };
		System.out.println("Before Sort : " + Arrays.toString(c));
		gs.sort(c);
		System.out.println("After Sort : " + Arrays.toString(c));
	}

}
