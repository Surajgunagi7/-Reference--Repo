package sdmcet.cse.oop.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set - No Duplicates and no Ordering
		HashSet<String> hs = new HashSet<String>();

		hs.add("Beta");
		hs.add("Gamma");
		hs.add("Alpha");
		hs.add("Delta");
		hs.add("Omega");
		hs.add("Epsilon");
		// Add some duplicates and observe the output(no! ordering)
		hs.add("Alpha");
		hs.add("Omega");

		System.out.println("Hash Set: " + hs);

		hs.remove("Delta");
		hs.remove("Omega");
		System.out.println("Hash Set: " + hs);
		
		//Remove an element not present
		hs.remove("abdj");
		
		
		//Explore the functionalities of the SETs
	}

}
