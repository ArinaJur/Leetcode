import java.util.HashMap;
import java.util.Map;

public class L1TwoSum {
    //leetcode 1
    //https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j ++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public int[] twoSum_On(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();

        for(int i = 0; i < nums.length; i ++) {
            int diff = target - nums[i];
            if(hm.containsKey(diff)) {
                return new int[]{hm.get(diff), i};
            } else {
                hm.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
