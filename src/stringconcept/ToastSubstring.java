package stringconcept;

public class ToastSubstring {

	public static void main(String[] args) {
		String s = "sweettoastbuttertoast";
		System.out.println("The given strings is: " + s);
		System.out.println("The new string is: " + toastSubstring(s));
	}

	public static String toastSubstring(String input) {
		if (input == null) {
			return "";
		} else if (input.isEmpty() | input.isBlank() | input.length() == 0) {
			return "";
		} else if (input.indexOf("toast") < 0) {
			return "";
		} else {
			int firstIndex = input.indexOf("toast");
			int lastIndex = input.lastIndexOf("toast");
			return input.substring(firstIndex + 5, lastIndex);
		}
	}
}