import java.util.ArrayList;
import java.util.List;

public class SumofAllOddLengthSubarrays {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 12 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		List<Integer> sumList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				if ((j - i) % 2 == 0) {
					for (int k = i; k <= j; k++) {
						sum += arr[k];
					}
				}
			}
			sumList.add(sum);
		}
		return sumList.stream().reduce(0, (a, b) -> a + b);
	}
}