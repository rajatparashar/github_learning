import java.util.Arrays;

public class FindtheIntegerAddedtoArrayI {

	public static void main(String[] args) {
		int[] nums1 = { 2, 6, 4 }, nums2 = { 9, 7, 5 };
		System.out.println(addedInteger(nums1, nums2));
	}

	public static int addedInteger(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		return nums2[0] - nums1[0];
	}
}