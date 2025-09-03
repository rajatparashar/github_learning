package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLiterals {

	public static void main(String[] args) {

		// mutable
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		System.out.println(browserList);

		browserList.add("safari");
		System.out.println(browserList);

		System.out.println("-----------");

		// Immutable AL:
		List<String> osList = Arrays.asList("windows", "mac", "linux");
		System.out.println(osList);
		// osList.add("unix");//UnsupportedOperationException
		System.out.println(osList);

		System.out.println("-----------");

		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 50, 90, 900));
		System.out.println(numList);
		Collections.reverse(numList);
		System.out.println(numList);

		System.out.println("-------------");

		// static array to dynamic array (AL):
		String browser[] = { "chrome", "firefox", "edge" };
		List<String> browserNamesList = Arrays.asList(browser);
		System.out.println(browserNamesList.size());// 3
		System.out.println(browserNamesList);

		System.out.println("----------------");

		ArrayList<String> list = new ArrayList<String>() {
			{
				add("Java");
				add("Python");
				add("Ruby");

			}
		};
		System.out.println(list.size());// 3
		list.add("C#");
		System.out.println(list.size());// 4

		System.out.println("------------");
		// jdk 1.9: immutable AL
		List<Integer> nList = List.of(1, 2, 3, 4, 5);// 5
		System.out.println(nList.size());// 5
		System.out.println(nList);
		// nList.add(10);//UnsupportedOperationException
		System.out.println(nList.size());// 6

	}

}
