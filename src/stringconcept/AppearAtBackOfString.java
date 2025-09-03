package stringconcept;

public class AppearAtBackOfString {

	public static void main(String[] args) {
		// case 1:
		String s1 = "xyz";
		String s2 = "pqrxyz";
		System.out.println("The given strings are: " + s1 + " and " + s2);
		System.out.println("Is one string appears at the end of other? " + stringAtback(s1, s2) + "\n");

		// case 2:
		s1 = "pqrxyz";
		s2 = "xyz";
		System.out.println("The given strings are: " + s1 + " and " + s2);
		System.out.println("Is one string appears at the end of other? " + stringAtback(s1, s2) + "\n");
	}

	public static boolean stringAtback(String s1, String s2) {
		if (s1 == null | s2 == null) {
			return false;
		} else if (s1.isEmpty() | s1.isBlank() | s2.isEmpty() | s2.isBlank()) {
			return false;
		} else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			if (s1.endsWith(s2) | s2.endsWith(s1)) {
				return true;
			} else {
				return false;
			}
		}
	}
}