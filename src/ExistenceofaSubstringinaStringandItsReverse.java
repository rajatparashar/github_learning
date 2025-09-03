public class ExistenceofaSubstringinaStringandItsReverse {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(isSubstringPresent(s));
	}

	public static boolean isSubstringPresent(String s) {
		String reverse = new StringBuilder(s).reverse().toString();
		for (int i = 0; i < s.length() - 1; i++) {
			String str = s.substring(i, i + 2);
			if (reverse.contains(str)) {
				return true;
			}
		}
		return false;
	}
}