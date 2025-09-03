public class AlphanumericString {
	public static void main(String[] args) {
		int lengthOfString = (int) (3 + Math.random() * 10);
		String alphabets = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		String numbers = "0123456789";
		StringBuilder finalString = new StringBuilder();
		for (int i = 0; i < lengthOfString; i++) {
			int randomNumber_Alphabets = (int) (Math.random() * 10);
			int randomNumber_Numbers = (int) (Math.random() * 10);

			finalString.append(alphabets.charAt(randomNumber_Alphabets));
			finalString.append(numbers.charAt(randomNumber_Numbers));

		}
		System.out.println(finalString.toString());
	}
}