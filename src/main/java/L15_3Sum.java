import java.util.*;

public class L15_3Sum {
    /*   https://leetcode.com/problems/3sum/
         15. 3Sum

         Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
         such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
         Notice that the solution set must not contain duplicate tri

         Example 1:
         Input: nums = [-1,0,1,2,-1,-4]
         Output: [[-1,-1,2],[-1,0,1]]
         Explanation:
         nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
         nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
         nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
         The distinct triplets are [-1,0,1] and [-1,-1,2].
         Notice that the order of the output and the order of the triplets does not matter.

         Example 2:
         Input: nums = [0,1,1]
         Output: []
         Explanation: The only possible triplet does not sum up

         Example 3:
         Input: nums = [0,0,0]
         Output: [[0,0,0]]
         Explanation: The only possible triplet sums up

         Constrains:
         3 <= nums.length <= 3000
         -105 <= nums[i] <= 105
    */

    public List<List<Integer>> threeSum(int[] nums) {
        int constrain = 100000;

        if (nums.length >= 3 && nums.length <= 3000) {

            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0, l = 0; i < nums.length - 2 && l < nums.length - 2; i++, l += 3) {
                if (l == i) {
                    if (
                            nums[l] < -constrain || nums[l] > constrain
                            && nums[l + 1] < -constrain || nums[l + 1] > constrain
                            && nums[l + 2] < -constrain || nums[l + 2] > constrain
                    ) {
                        return null;
                    }
                }
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = i + 2; k < nums.length; k++) {
                        if (
                                i != j && i != k && j != k
                                && nums[i] + nums[j] + nums[k] == 0
                        ) {
                            Integer[] temp = {nums[i], nums[j], nums[k]};
                            Arrays.sort(temp);
                            List<Integer> temp2 = Arrays.asList(temp);

                            if (!result.contains(temp2)) {
                                result.add(temp2);
                            }
                        }
                    }
                }
            }

            return result;
        }

        return null;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i ++) {
            for (int j = i + 1; j < nums.length - 1; j ++) {
                for (int k = i + 2; k < nums.length; k ++) {
                    if (
                            i != j && i != k && j != k
                            &&
                            nums[i] + nums[j] + nums[k] == 0
                    ) {
                        Integer[] temp = {nums[i], nums[j], nums[k]};
                        Arrays.sort(temp);
                        List<Integer> temp2 = Arrays.asList(temp);

                        if (!result.contains(temp2)) {
                            result.add(temp2);
                        }
                    }
                }
            }
        }

        return result;
    }
}
