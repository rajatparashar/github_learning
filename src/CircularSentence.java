public class CircularSentence {
	public static void main(String[] args) {
		String sentence = "leetcode exercises sound delightful";
		System.out.println(isCircularSentence(sentence));
	}

	public static boolean isCircularSentence(String sentence) {
		if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
			return false;
		}
		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
				return false;
			}
		}
		return true;
	}
}
