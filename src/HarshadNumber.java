
public class HarshadNumber {

	public static void main(String[] args) {
		int x = 23;
		System.out.println(sumOfTheDigitsOfHarshadNumber(x));
	}

	public static int sumOfTheDigitsOfHarshadNumber(int x) {
		int sum = 0, temp = x;
		while (temp > 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		return x % sum == 0 ? sum : -1;
	}
}