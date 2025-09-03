//https://github.com/sumeet-automation/selenium-java-interview?tab=readme-ov-file#strings
package sumeetautomation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LoopsAndArraysPracticeSet1 {
	public static void main(String[] args) {
//		printNmbersExcept478();

//		int[] arr = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
//		findMissingElement(arr);

//		sumEven(20);

//		rightTriangle(6, 8, 10);

//		int[] arr = { 8, 1, 6, 5, 10, 3, 9, 7, 4, 2 };
//		findElementsWithMaxProduct(arr);

//		firstLastDigitsOfNumer(29017);

//		swapFirstAndLastDigits(4891206);

//		lengthOfInteger(39212374);

//		sumOfDigitsOfInteger(8927312);

//		int[] arr = { 8, 1, 6, 5, 10, 3, 9, 7, 4, 2 };
//		printReverseArray(arr);

//		findMax(1, 8, 4);
//		int[] arr = { 8, 1, 6, 5, 10, 3, 9, 7, 4, 2 };
//		findMaxElement(arr);

//		int[] arr = { 6, 1, 6, 5, 10, 3, 2, 7, 6, 2 };
//		findDuplicates(arr);

//		long num = 5689123454798197L;
//		findFrequency(num);

//		int[] arr = { 8, 1, 6, 5, 10, 3, 9, 7, 4, 2 };
//		sortArray(arr);

//		int a = 4, b = 7;
//		swapValues(a, b);

//		long num = 987859834050246L;
//		findOddEvenSum(num);

		int[] arr = { 8, 1, 6, 5, 10, 3, 9, 7, 4, 2 };
		largestSumOfSubset(arr);
	}

	// 1. Write a program to print numbers from 1 to 10, excluding 4,7,8.
	public static void printNmbersExcept478() {
		for (int i = 1; i <= 10; i++) {
			if (i == 4 | i == 7 | i == 8) {
				continue;
			}
			System.out.println(i);
		}
	}

	// 2. Given an array of 1 to n numbers with one number missing, write a program
	// to print the missing number.
	public static void findMissingElement(int[] arr) {
		int sum = (10 * 11) / 2;
		for (int e : arr) {
			sum = sum - e;
		}
		System.out.println("Missing number is " + sum);
	}

	// 3. Write a program to print the sum of all even numbers from 1 to n.
	public static void sumEven(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i += 2) {
			sum += i;
		}
		System.out.println("The sum of all even numbers from 1 to " + n + " is " + sum);
	}

	// 6. Given three random integers, find whether they will form right angles
	// triangle or not.
	public static void rightTriangle(int n1, int n2, int n3) {
		int base2 = n1 * n1;
		int height2 = n2 * n2;
		int hypo2 = n3 * n3;
		if ((base2 + height2 == hypo2) || (base2 + hypo2 == height2) || (hypo2 + height2 == base2)) {
			System.out.println("Given points form a right triangle");
		} else {
			System.out.println("Given points DO NOT form a right triangle");
		}
	}

	// 7. Given an integer array, find which two elements gives the maximum product.
	public static void findElementsWithMaxProduct(int[] arr) {
		int a = 0, b = 0, product = 1;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] * arr[j] > product) {
					a = arr[i];
					b = arr[j];
					product = arr[i] * arr[j];
				}
			}
		}
		System.out.println("Two elements gives the maximum product are " + a + " and " + b);
	}

	// 8. Write a program to find the first and last digits of an integer number.
	public static void firstLastDigitsOfNumer(int num) {
		int number = num, first = num % 10;
		while (num >= 10) {
			num = num / 10;
		}
		System.out.println("the first and last digits of " + number + " are " + first + " and " + num);
	}

	// 9.Write a program to swap the first and last digit of a given number.
	public static void swapFirstAndLastDigits(int num) {

	}

	// 10. Write a program to find the length of an integer number.
	public static void lengthOfInteger(int num) {
		int len = 1, number = num;
		while (num >= 10) {
			num = num / 10;
			len++;
		}
		System.out.println("the length of " + number + " is " + len);

	}

	// 11. Write a program to find to calculate the sum of all digits in a given
	// number.
	public static void sumOfDigitsOfInteger(int num) {
		int sum = 0, number = num;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("the sum of all digits in " + number + " is " + sum);
	}

	// 12.Write a program to print the array of integers in reverse order.
	public static void printReverseArray(int[] arr) {
		int t = arr.length - 1;
		for (int e : arr) {
			if (t >= 0) {
				System.out.print(arr[t] + " ");
				t--;
			}
		}
	}

	// 13.Write a program to find greatest of three numbers without using Max
	// function.
	public static void findMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is greatest number");
			} else if (a < c) {
				System.out.println(c + " is greatest number");
			}
		} else if (b > a) {
			if (b > c) {
				System.out.println(b + " is greatest number");
			} else if (b < c) {
				System.out.println(c + " is greatest number");
			}
		}
	}

	// 14.Write a program to find maximum from given array without using Max
	// function.
	public static void findMaxElement(int[] arr) {
		int max = 0;
		for (int e : arr) {
			if (e > max) {
				max = e;
			}
		}
		System.out.println("the maximum from the given array is " + max);
	}

	// 15.Write a program to find distinct and duplicates elements from an array.
	public static void findDuplicates(int[] arr) {
		Set<Integer> duplicate = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int e : arr) {
			if (!set.add(e)) {
				duplicate.add(e);
			}
		}
		System.out.println("Duplicate elements are " + duplicate);
	}

	// 16.Write a program to print the frequency of each digit in a given number.
	public static void findFrequency(long num) {
		Map<Long, Integer> map = new HashMap<>();
		while (num > 0) {
			long n = num % 10;
			num = num / 10;
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		System.out.println(map);
	}

	// 17.Write a program to sort an array in ascending order without using any
	// inbuilt functions.
	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("sort an array in ascending order");
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	// 21.Write a program to swap two values in a variable without using third
	// variable.
	public static void swapValues(int a, int b) {
		System.out.println("Values before swap: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b; // 11
		b = a - b; // 4
		a = a - b;
		System.out.println("Values after swap: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	// 22.Given a number, calculate sum of all even digits and all odd digits
	// separately in a given number.
	public static void findOddEvenSum(long num) {
		int oddSum = 0, evenSum = 0;
		while (num > 0) {
			long n = num % 10;
			num = num / 10;
			if (n % 2 == 0) {
				evenSum += n;
			} else {
				oddSum += n;
			}
		}
		System.out.println("Odd sum is " + oddSum);
		System.out.println("Even sum is " + evenSum);
	}

	// 23.Given a array of 10 numbers, find largest sum of subset of 3 continuous
	// elements.
	public static void largestSumOfSubset(int[] arr) {
		System.out.println("Given array is: " + Arrays.toString(arr));
		int sum = 0, a = 0, b = 0, c = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] + arr[i + 1] + arr[i + 2] > sum) {
				sum = arr[i] + arr[i + 1] + arr[i + 2];
				a = arr[i];
				b = arr[i + 1];
				c = arr[i + 2];
			}
		}
		System.out.println("Largest sum of subset of 3 continuous elements is " + (a + b + c));
		System.out.println("3 continuous elements are " + a + ", " + b + " and " + c);
	}
}