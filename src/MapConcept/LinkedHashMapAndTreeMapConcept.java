package MapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMapConcept {

	public static void main(String[] args) {
		Map<String, Integer> empMap = new HashMap<String, Integer>();
//		Map<String, Integer> empMap = new LinkedHashMap<String, Integer>();
//		Map<String, Integer> empMap = new TreeMap<String, Integer>();

		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("pooja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavithra", 30);
		empMap.put("radha", 50);
		empMap.put("deb", 60);
		empMap.put("Tom", 70);
		empMap.put("1test", 75);

		System.out.println(empMap);

	}

}
