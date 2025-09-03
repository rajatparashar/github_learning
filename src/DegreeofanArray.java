import java.util.*;

public class DegreeofanArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 1 };
		System.out.println(findShortestSubArray(nums));
	}

	public static int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxFrequency = 0;
		for (int n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			int n = m.getValue();
			if (n > maxFrequency) {
				maxFrequency = n;
			}
		}
		Set<Integer> numsWithMaxFreq = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			int n = m.getValue();
			if (n == maxFrequency) {
				numsWithMaxFreq.add(m.getKey());
			}
		}
		Iterator<Integer> it = numsWithMaxFreq.iterator();

		List<Integer> list = new ArrayList<Integer>();
		for (int n : nums) {
			list.add(n);
		}

		int length = 9999999;
		while (it.hasNext()) {
			int freq = it.next();
			int firstIndex = list.indexOf(freq);
			int lastIndex = list.lastIndexOf(freq);
			if (lastIndex - firstIndex < length) {
				length = lastIndex - firstIndex;
			}

		}
		return length + 1;
	}
}