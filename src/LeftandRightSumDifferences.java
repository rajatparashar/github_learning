public class LeftandRightSumDifferences {

	public static void main(String[] args) {
		int[] nums = { 10, 4, 8, 3 };
		int[] answer = leftRightDifference(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

	public static int[] leftRightDifference(int[] nums) {
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int leftsum = 0, rightsum = 0;
			for (int j = 0; j <= i - 1; j++) {
				leftsum += nums[j];
			}
			leftSum[i] = leftsum;
			for (int j = i + 1; j < nums.length; j++) {
				rightsum += nums[j];
			}
			rightSum[i] = rightsum;
		}
		for (int i = 0; i < nums.length; i++) {
			answer[i] = Math.abs(leftSum[i] - rightSum[i]);
		}
		return answer;
	}
}