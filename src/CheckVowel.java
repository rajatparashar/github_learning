
public class CheckVowel {

	public static void main(String[] args) {

		String input = "qwrtyplkjhegfdszxcvbnm";

		if (input.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println(input + " contains vowel");
		} else {
			System.out.println(input + " does not contain vowel");
		}
	}

}
