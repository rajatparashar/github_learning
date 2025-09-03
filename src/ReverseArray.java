import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			output[arr.length - i - 1] = arr[i];
		}
		System.out.println(Arrays.toString(output));
	}
}