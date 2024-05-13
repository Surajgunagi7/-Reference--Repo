package sdmcet.cse.oop.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// The Linked list implements both list and queue
		LinkedList<String> ll = new LinkedList<String>(); // Doubly Linked List

		ll.add("Java");
		ll.add("C");
		ll.add("C++");
		ll.add("Ruby");

		ll.addFirst("Django");
		ll.addLast("Flutter");

		System.out.println("Linked List: " + ll);

		ll.remove("C++");
		ll.remove(2);
		System.out.println("Linked List: " + ll);

		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linked List: " + ll);

		// Get and set and put methods for LL
		String str = ll.get(1);
		ll.set(1, str + " Changed");
		System.out.println("Linked List: " + ll);

//		ll.set(1, ll.get(1)+" one");
//		System.out.println("Linked List: " + ll);
	}

}
