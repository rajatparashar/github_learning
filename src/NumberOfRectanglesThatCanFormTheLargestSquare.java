import java.util.HashMap;
import java.util.Map;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
	public static void main(String[] args) {
		int[][] rectangles = { { 2, 3 }, { 1, 2 }, { 3, 1 }, { 3, 1 }, { 2, 3 }, { 2, 1 }, { 2, 3 }, { 1, 3 }, { 3, 1 },
				{ 1, 3 }, { 3, 2 }, { 2, 3 }, { 2, 1 }, { 1, 3 }, { 3, 2 }, { 1, 2 }, { 3, 1 }, { 2, 1 }, { 1, 3 },
				{ 3, 2 } };
		System.out.println(countGoodRectangles(rectangles));
	}

	public static int countGoodRectangles(int[][] rectangles) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < rectangles.length; i++) {
			int side = Math.min(rectangles[i][0], rectangles[i][1]);
			if (map.containsKey(side)) {
				map.put(side, map.get(side) + 1);
			} else {
				map.put(side, 1);
			}
		}
		System.out.println(map);
		int maxLen = Integer.MIN_VALUE, count = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getKey() >= maxLen) {
				maxLen = e.getKey();
				count = e.getValue();
			}
		}
		return count;
	}
}