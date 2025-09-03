public class ClearDigits {
	public static void main(String[] args) {
		String s = "kbnk5b6mnb7mn6bn";
		System.out.println(clearDigits(s));
	}

	public static String clearDigits(String s) {
		StringBuilder sb = new StringBuilder(s);
		while (sb.toString().matches(".*[0-9].*")) {
			int numberIndex = -1;
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
					numberIndex = i;
					break;
				}
			}
			sb.delete(numberIndex, numberIndex + 1);
		}
		return sb.toString();
	}
}