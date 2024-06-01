


import java.util.Arrays;

public class GenericsSortDemo {

	private <T> void swap(T array[], int i, int j) {
		if (i != j) {
			T temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public <T extends Comparable<T>> void sort(T array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {

				if (array[j].compareTo(array[smallest]) <= 0) {
					smallest = j;
				}
			}
			swap(array, i, smallest);
		}
	}

	public static void main(String[] args) {

		GenericsSortDemo gs = new GenericsSortDemo();

		Integer num[] = { 3, 4, 1, 5, 2 };
		System.out.println("Before Sort: " + Arrays.toString(num));
		gs.sort(num);
		System.out.println("After Sort: " + Arrays.toString(num));

		String str[] = { "mango", "grapes", "cherry", "apple", "orange" };
		System.out.println("Before Sort: " + Arrays.toString(str));
		gs.sort(str);
		System.out.println("After Sort: " + Arrays.toString(str));
	}

}
