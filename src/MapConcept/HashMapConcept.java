package MapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		// key-value pair
		// non order based collection

		HashMap<String, Integer> empMap = new HashMap<String, Integer>();

		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("pooja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavithra", 30);
		empMap.put("radha", 50);
		empMap.put("radha", 60);
		empMap.put("deb", 60);
		empMap.put(null, 5);
		empMap.put(null, 7);
		empMap.put(null, 8);
		empMap.put("peter", null);

		System.out.println(empMap.get("ravi"));
		System.out.println(empMap.get("tom"));// null
		System.out.println(empMap.get("radha"));
		System.out.println(empMap.get("deb"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("peter"));

		System.out.println(empMap);

	}

}
