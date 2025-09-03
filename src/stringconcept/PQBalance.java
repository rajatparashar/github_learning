package stringconcept;

public class PQBalance {

	public static void main(String[] args) {
		// case 1:
		String s = "gfpmpnppqab";
		System.out.println("The given strings is: " + s);
		System.out.println("The string is pq-balanced?" + pqBalance(s) + "\n");

		// case 2:
		s = "gfpmpnpqpab";
		System.out.println("The given strings is: " + s);
		System.out.println("The string is pq-balanced?" + pqBalance(s) + "\n");

		// case 3:
		s = "";
		System.out.println("The given strings is: " + s);
		System.out.println("The string is pq-balanced?" + pqBalance(s) + "\n");

		// case 4:
		s = null;
		System.out.println("The given strings is: " + s);
		System.out.println("The string is pq-balanced?" + pqBalance(s) + "\n");
	}

	public static boolean pqBalance(String input) {
		if (input == null) {
			return false;
		} else if (input.isEmpty() | input.isBlank() | input.length() == 0) {
			return false;
		} else if (!input.contains("pq")) {
			return false;
		} else if (input.contains("qp")) {
			return false;
		} else if (input.contains("pq")) {
			return true;
		}
		return true;
	}
}