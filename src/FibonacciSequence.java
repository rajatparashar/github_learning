public class FibonacciSequence {
	public static void main(String[] args) {
		int num = 10;
		printFibonacciSequence(num);
	}

//	0,1,1,2,3,5,8,13

	public static void printFibonacciSequence(int num) {
		int a = 0, b = 1, c = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}

	}
}