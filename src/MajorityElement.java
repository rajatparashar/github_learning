import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(2);
		System.out.println(majorityElement(list));
	}

	public static int majorityElement(final List<Integer> A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer e : A) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			int num = e.getValue();
			if (num > A.size() / 2) {
				return e.getKey();
			}
		}
		return 0;
	}
}