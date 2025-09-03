
public class NonRepeatCharacter {

	public static void main(String[] args) {

		String input = "inppinutut";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println("first non repeating characters is " + ch);
				break;
			}

		}

	}

}
