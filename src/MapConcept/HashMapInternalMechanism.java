package MapConcept;

import java.util.HashMap;

public class HashMapInternalMechanism {

	public static void main(String[] args) {
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();

		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("pooja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavithra", 30);
		empMap.put("radha", 50);
		empMap.put("deb", 60);
		empMap.put(null, 5);

		System.out.println(empMap);
		System.out.println(empMap.size());// pc

		// <k,v>

	}

}
