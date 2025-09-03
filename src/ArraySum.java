import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySum {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int n = Integer.parseInt(name);

		String input = br.readLine();
		String arr[] = input.split(" ");
		long inputarr[] = new long[n];
		for (int i = 0; i < n; i++) {
			inputarr[i] = Long.parseLong(arr[i]);
		}

		long sum = 0L;
		for (long lg : inputarr) {
			sum += lg;
		}
		System.out.println(sum);
	}
}