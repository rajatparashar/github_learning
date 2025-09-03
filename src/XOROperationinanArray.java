public class XOROperationinanArray {
	public static void main(String[] args) {
		int n = 4, start = 3;
		System.out.println(xorOperation(n, start));
	}

	public static int xorOperation(int n, int start) {
		int xor = 0;
		for (int i = 0; i < n; i++) {
			xor = xor ^ (start + 2 * i);
		}
		return xor;
	}
}