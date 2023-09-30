import java.util.Arrays;

public class L268MissingNumber {
    //268. Missing Number
    //https://leetcode.com/problems/missing-number/

    public int missingNumber2(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for(int i : nums) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }

        }
        return nums.length;

    }
}
