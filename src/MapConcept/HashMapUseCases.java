package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapUseCases {

	public static String getCredentials(String role) {
		System.out.println("getting user credentials for role: " + role);

		Map<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin@open.com ;admin123");
		credMap.put("seller", "selelr@sel.com;seller123");
		credMap.put("customer", "niton@gmail.com;nitin123");
		credMap.put("vendor", "deepika@vendor.com;deep123");
		credMap.put("partner", "bhagyashri@partner.com;bhagya123");

		return credMap.get(role);
	}

	public static void main(String[] args) {

		String creds = getCredentials("vendor");
		System.out.println(creds);// admin@open.com ;admin123

		String credArr[] = creds.split(";");
		String username = credArr[0].trim();
		String password = credArr[1].trim();

		System.out.println("login with : " + username + " and " + password);

		// k-v: use cases:
		// 1. RBAC feature: admin, naveen, seller, partner, vendor, distributor
		// 2. product data: meta data, price
		// 3. Excel data: <k,v>: <String, List<String>>
		// 4. value from db: <k,v>
		// 5. api testing: headers <String, String>: <"Authorization", "Bearer token">
		// 6. query params:
		// 7. json/xml:

	}

}
