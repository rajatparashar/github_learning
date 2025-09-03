public class PrimeNumberTest {
	public static void main(String[] args) {
		int number = 11;
		System.out.println("Is " + number + " a prime number? " + PrimeNumberTest.isPrime(number));
	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}