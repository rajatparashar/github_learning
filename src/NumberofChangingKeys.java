import java.util.Iterator;

public class NumberofChangingKeys {

	public static void main(String[] args) {
		String s = "AaAaAaaA";
		System.out.println(countKeyChanges(s));
	}

	public static int countKeyChanges(String s) {
		String input = s;
		int count = 0;
		input = input.toLowerCase();
		for (int i = 0; i < s.length() - 1; i++) {
			if (input.charAt(i) != input.charAt(i + 1))
				count++;
		}
		return count;
	}
}
