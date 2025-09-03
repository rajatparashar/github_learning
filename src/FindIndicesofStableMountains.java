import java.util.ArrayList;
import java.util.List;

public class FindIndicesofStableMountains {

	public static void main(String[] args) {
		int[] height = { 10, 1, 10, 1, 10 };
		int threshold = 10;
		System.out.println(stableMountains(height, threshold));
	}

	public static List<Integer> stableMountains(int[] height, int threshold) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < height.length; i++) {
			if (height[i - 1] > threshold) {
				list.add(i);
			}
		}
		return list;
	}
}
