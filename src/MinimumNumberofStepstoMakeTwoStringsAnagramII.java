public class MinimumNumberofStepstoMakeTwoStringsAnagramII {
	public static void main(String[] args) {
		String s = "night", t = "thing";
		System.out.println(minSteps(s, t));
	}

	public static int minSteps(String s, String t) {
		int count = 0;
		for (int i = 0; i < 26; i++) {
			char ch = (char) (i + 97);
			int frequencyInS = 0, frequencyInT = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ch) {
					frequencyInS++;
				}
			}
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) == ch) {
					frequencyInT++;
				}
			}
			count += Math.abs(frequencyInT - frequencyInS);
		}
		return count;
	}
}