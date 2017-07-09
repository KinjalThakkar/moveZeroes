package moveZeroes;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int insertPos = 0;
		for (int num : nums) {
			if (num != 0)
				nums[insertPos++] = num;
		}
		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 3, 0, 12, 0 };
		moveZeroes(nums);
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
