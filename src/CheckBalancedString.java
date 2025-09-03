public class CheckBalancedString {
	public static void main(String[] args) {
		String num = "24123";
		System.out.println(isBalanced(num));
	}

	public static boolean isBalanced(String num) {
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < num.length(); i++) {
			if (i % 2 == 0) {
				oddSum += num.charAt(i) - 48;
			} else {
				evenSum += num.charAt(i) - 48;
			}
		}
		return evenSum == oddSum;
	}
}