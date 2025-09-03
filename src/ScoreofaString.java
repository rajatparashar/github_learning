public class ScoreofaString {

	public static void main(String[] args) {
		String s = "zaz";
		System.out.println(scoreOfString(s));
	}

	public static int scoreOfString(String s) {
		int sum = 0;
		for (int i = 1; i < s.length(); i++) {
			int num = Math.abs(s.charAt(i) - s.charAt(i - 1));
			sum += num;
		}
		return sum;
	}
}