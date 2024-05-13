package sdmcet.cse.oop.collections;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {

		// A Vector having size: 3 and increment: 2
		// If increment is not specified increment is doubled
		Vector<Integer> v = new Vector<Integer>(3, 2);

		// To add elements we use add method also
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);

		// to display the capacity of the vector
		System.out.println("Capacity :" + v.capacity());
		System.out.println("Size: " + v.size());
		v.addElement(4);
		v.addElement(6);
		System.out.println("\nCapacity :" + v.capacity());
		System.out.println("Size: " + v.size());
		v.addElement(5);
		v.addElement(8);
		v.addElement(10);
		System.out.println("\nCapacity :" + v.capacity());
		System.out.println("Size: " + v.size());

		// to display the vector
		System.out.println("\nVectors: " + v);

		// To display the first and last element of the list
		System.out.println("Vectors: " + v.firstElement());
		System.out.println("Vectors: " + v.lastElement());
		
		//to check whether the element is present or not
		if(v.contains(4)) 
			System.out.println("Element present!");
		else
			System.out.println("Element not present");
		
		//to remove element from the vector
		v.removeElementAt(1);  //index
		v.removeElement(4); //element is specified
		System.out.println("Vectors: " + v);
		
		//If the removed element is not present
		v.removeElement(15); // nothing happens
		
		try {
			v.removeElementAt(15);
		} catch (IndexOutOfBoundsException iob) {
			System.out.println("\n!!!EXCEPTION: Element not found at index..!");
		}
		
	}

}
