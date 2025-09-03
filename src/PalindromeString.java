public class PalindromeString {

	public static void main(String[] args) {
		String input = "naman";
		System.out.println("Is '" + input + "' a palindrome ? " + PalindromeString.checkPalindrome(input));
	}

	public static boolean checkPalindrome(String str) {
		if (str.length() == 1) {
			return true;
		}
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}