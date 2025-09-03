import java.util.*;

public class PositionsofLargeGroups {
	public static void main(String[] args) {
		String s = "abbxxxxzzy";
		System.out.println(largeGroupPositions(s));
	}

	public static List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		List<String> temp = new ArrayList<>();
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j)) {
					temp.add(s.substring(i, j));
					i = j;
				}
			}
		}
		
		long lk = 3454654654654L;
		
		float ff= 32.99999991F;
		
		double gg = 100;
		System.out.println(gg*2.5);
		System.out.println(temp);
		return output;
	}
}