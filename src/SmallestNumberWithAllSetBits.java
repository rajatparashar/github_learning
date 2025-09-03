public class SmallestNumberWithAllSetBits {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(smallestNumber(n));
	}

	public static int smallestNumber(int n) {
		int count = 1;
		while (n >= Math.pow(2, count)) {
			count++;
		}
		return (int) (Math.pow(2, count) - 1);
	}
}