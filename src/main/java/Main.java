import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

	}

	public static int removeDuplicates(int[] nums) {
		// variables
		//int currentUniqueNumber;
		int k = 0;
		//int firstAvailableIndex =0;

		// edge case, if nums is empty return zero
		if (nums.length == 0) {
			return 0;
		}
		// if not empty, set index 0 to current number and increment unique number accumulator
		// else{
		// 	currentUniqueNumber = nums[0];
		// 	k++;
		// }

		// find the amount of unique numbers in num
		// if you encounter a new unique number increment
		// use for loop to iterate through nums
		for (int i = 1; i < nums.length; i++) {
			// if index number does not match current number, increment int value for unique numbers and update current number
			if (nums[i] != nums[k]) {
				// currentUniqueNumber = nums[i];
				k++;
				nums[k] = nums[i];
			}
		}

		// return k
		// add 1 because we started at index 0
		return k + 1;
	}
}
