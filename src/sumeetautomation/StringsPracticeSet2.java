//https://github.com/sumeet-automation/selenium-java-interview?tab=readme-ov-file#strings
package sumeetautomation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringsPracticeSet2 {

	public static void main(String[] args) {
//		String s = "     Hello world        ";
//		removeLeadingandTrailingSpaces(s);

//		String s = " Hello world";
//		reverseString(s);

//		String s = "naman";
//		isPalindrome(s);

//		String s = "this is a long sentence containing multiple words";
//		printFrequency(s);

//		String s = "AAABBCDA";
//		A4B2C1D1(s);

//		String s = "ABC CORPORATION CENTER";
//		secondLastOccurance(s);

//		String s = "abds323a4b45a";
//		countDigits(s);

//		String s = "abds323a4b45a";
//		printSumOfDigits(s);

//		String s = "HELLO, HOW ARE YOU";
//		printVowels(s);

		String s = "HARI";
		printNextChar(s);

	}

	// 23.Write a program to remove the leading and trailing white spaces from a
	// String.
	public static void removeLeadingandTrailingSpaces(String s) {
		s = s.trim();
		System.out.println("String after removing trailing and leading spaces :" + s);
	}

	// 24.Write a program to reverse a string without using the reverse function.
	public static void reverseString(String s) {
		System.out.println("Given String is:" + s);
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println("Reverse of String is:" + sb.toString());
	}

	// 25.Write a program to find whether a string is palindrome or not.
	public static void isPalindrome(String s) {
		System.out.println("Given string is :" + s);
		boolean flag = true;
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is NOT palindrome");
		}
	}

	// 26.Write a program to print the frequency of each character in a given word.
	public static void printFrequency(String s) {
		System.out.println("Given string is :" + s);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

	// 30.Given a string “AAABBCDA”, write a program that give output as "A4B2C1D1".
	public static void A4B2C1D1(String s) {
		System.out.println("Given string is :" + s);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> es : map.entrySet()) {
			Character key = es.getKey();
			Integer value = es.getValue();
			sb.append(key);
			sb.append(value);
		}
		System.out.println(sb.toString());

	}

	// 31.Given a string ‘ABC CORPORATION CENTER’, find index of second last ‘C’.
	public static void secondLastOccurance(String s) {
		System.out.println("Given sring is :" + s);
		String temp = s.substring(0, s.lastIndexOf('C'));
		System.out.println("index of second last 'C' is: " + temp.lastIndexOf("C"));
	}

	// 32.Given a string like “abds323a4b45a”, write a program to find the count the
	// number of digits present in the string.
	public static void countDigits(String s) {
		System.out.println("Given string is :" + s);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (Character.isDigit(ch))
				count++;
		}
		System.out.println("Number of digits present in the string is :" + count);
	}

	// 33.Given a string like “abds323a4b45a”, write a program to find sum of each
	// digit present in string.
	public static void printSumOfDigits(String s) {
		System.out.println("Given string is :" + s);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (Character.isDigit(ch))
				sum += Integer.parseInt("" + ch);
		}
		System.out.println("Sum of digits present in the string is :" + sum);

	}

	// 34.Given a String ‘HELLO, HOW ARE YOU’, print all the vowels that occurred in
	// string.
	public static void printVowels(String s) {
		System.out.println("Given string is :" + s);
		Set<Character> vowelsList = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowelsList.add(ch);
			}
		}
		System.out.println("All the vowels are : " + vowelsList);
	}

	// 39.Write a program to print the next letter of each character from a given
	// String. Ex -> I/P = HARI, O/P = “IBSJ”.
	public static void printNextChar(String s) {
		System.out.println("Given string is :" + s);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			sb.append((char) (ch + 1));
		}
		System.out.println(sb.toString());
	}
}