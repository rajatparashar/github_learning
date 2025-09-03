public class FactorialUseingReccursion {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(factorial(n));
	}

	public static long factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}