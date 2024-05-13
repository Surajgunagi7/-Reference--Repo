package sdmcet.cse.oop.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("ABC", 1050.50);
		hm.put("XYZ", 2859.26);
		hm.put("RTY", 1254.89);
		hm.put("YUI", 7894.58);
		hm.put("IOP", 5698.26);
		hm.put("HJK", 9657.16);

		// Duplicate - Previous value is overridden
		hm.put("YUI", 4569.58);
		// To Display the HashMap

		// Get a set of entries(convert to set)
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		for (Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey() + ":" + me.getValue());
		}

		// Modify the values
		double salary = hm.get("RTY");
		hm.put("RTY", (salary + salary * 0.1));
		System.out.println("\nResult:");
		for (Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey() + ":" + me.getValue());
		}
	}

}
