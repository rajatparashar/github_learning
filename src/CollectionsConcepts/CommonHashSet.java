package CollectionsConcepts;

import java.util.*;

public class CommonHashSet {

	public static void main(String[] args) {
		Set<String> city = new HashSet<String>(
				Arrays.asList("Agra", "Mathura", "Mumbai", "Delhi", "Noida", "Gurugram"));

		System.out.println("Printing city set");
		System.out.println(city);
		System.out.println("-------------------------------");

		System.out.println("Adding Jaipur");
		city.add("Jaipur");
		System.out.println(city);
		System.out.println("-------------------------------");

		System.out.println("Iterator city set");
		Iterator<String> it = city.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Printing set size");
		System.out.println(city.size());
		System.out.println("-------------------------------");
		System.out.println("Removing all elements from city set");
		city.removeAll(city);
		System.out.println(city);
		System.out.println("-------------------------------");

		System.out.println("Creating a new set");
		Set<Integer> num = new HashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		System.out.println(num);
		System.out.println("-------------------------------");
		System.out.println("Iterating till 6");
		Iterator<Integer> i = num.iterator();
		while (i.hasNext()) {
			int n = i.next();
			if (n < 7)
				System.out.print(n + " ");
			else
				break;
		}

	}
}