import java.util.Arrays;

public class L136SingleNumber {
    //136. Single Number
    //https://leetcode.com/problems/single-number/

    public int singleNumber(int[] nums) {
        if (nums.length != 1 && nums.length > 0) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; ) {
                if (nums[i] == nums[i + 1]) {
                    if (i + 2 == nums.length - 1) {
                        return nums[i + 2];
                    } else {
                        i += 2;
                    }
                } else {
                    return nums[i];
                }
            }
        }
        return nums[0];
    }
}
