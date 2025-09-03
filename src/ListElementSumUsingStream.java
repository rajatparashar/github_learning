import java.util.Arrays;
import java.util.List;

public class ListElementSumUsingStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 7, 9, 0);
		int sum = list.stream().reduce(0, (a, b) -> (a + b));
		System.out.println(sum);
	}
}