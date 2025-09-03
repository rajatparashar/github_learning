import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
	public static void main(String[] args) {
		String[] ops = { "1", "C" };
		System.out.println(calPoints(ops));
	}

	public static int calPoints(String[] operations) {
		List<Integer> list = new ArrayList<Integer>();
		for (String s : operations) {
			if (s.equals("C")) {
				list.remove(list.size() - 1);
			} else if (s.equals("D")) {
				list.add(list.get(list.size() - 1) * 2);
			} else if (s.equals("+")) {
				list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
			} else {
				list.add(Integer.parseInt(s));
			}
		}
		if (list.size() == 0) {
			return 0;
		} else {
			int sum = 0;
			for (int s : list) {
				sum += s;
			}
			return sum;
		}
	}
}