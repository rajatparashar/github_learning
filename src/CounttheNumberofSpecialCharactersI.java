public class CounttheNumberofSpecialCharactersI {
	public static void main(String[] args) {
		String word = "aaAbcBC";
		System.out.println(numberOfSpecialChars(word));
	}

	public static int numberOfSpecialChars(String word) {
		int count = 0;
		char CH[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i <= 25; i++) {
			if (word.contains(CH[i] + "") && (word.contains(ch[i] + ""))) {
				count++;
			}
		}
		return count;
	}
}