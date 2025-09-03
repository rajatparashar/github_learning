package CollectionsConcepts;

import java.util.*;

public class CommonArrayList {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>(
				Arrays.asList("violet", "indigo", "blue", "green", "yellow", "orange", "red"));
		System.out.println(colors);

		System.out.println("-------------------------------");

		for (int i = 0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
		}
		System.out.println();
		System.out.println("-------------------------------");

		colors.add(1, "pink");
		System.out.println(colors);
		System.out.println("-------------------------------");
		System.out.println(colors.get(3));
		System.out.println("-------------------------------");
		colors.set(5, "black");
		System.out.println(colors);
		System.out.println("-------------------------------");

		colors.remove(3);
		System.out.println(colors);
		System.out.println("-------------------------------");

		for (int i = 0; i < colors.size(); i++) {
			if (colors.get(i).equalsIgnoreCase("black")) {
				System.out.println("Color black found on position " + i);
				break;
			}
		}
		System.out.println("-------------------------------");

		Collections.sort(colors);
		System.out.println(colors);

		List<String> colorsCopy = new ArrayList<String>();
		colorsCopy.addAll(colors);
		System.out.println(colorsCopy);
		System.out.println(colorsCopy.size());
		System.out.println("-------------------------------");

		System.out.println("Shuffling elements in colors list");
		Collections.shuffle(colors);
		System.out.println(colors);
		System.out.println("-------------------------------");

		System.out.println("Actual List");
		System.out.println(colors);
		System.out.println("Reversing the list");
		Collections.reverse(colors);
		System.out.println(colors);
		System.out.println("-------------------------------");

		System.out.println("Getting sublist from colors list from [2, 5):");
		System.out.println(colors.subList(2, 5));
		System.out.println("-------------------------------");
		System.out.println("Making list Empty");
		colors.removeAll(colors);
		System.out.println(colors);
	}
}