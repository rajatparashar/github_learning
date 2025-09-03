import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bulbs {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 0, 0, 1, 1, 0, 0, 1);
		System.out.println(bulbs(list));
	}

	public static int bulbs(List<Integer> A) {
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == 0) {
				for (int j = i; j < A.size(); j++) {
					if (A.get(j) == 0) {
						A.set(j, 1);
					} else {
						A.set(j, 0);
					}
				}
				count++;
			}
		}
		return count;
	}
}