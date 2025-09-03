public class CheckPrime {
	public static void main(String[] args) {
		int number = 13;
		System.out.println("Is " + number + " prime? : " + checkPrime(number));
	}

	public static boolean checkPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		if (num == 2) {
			return true;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}