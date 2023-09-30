import java.util.Arrays;

public class L27RemoveElement {

    //27. Remove Element
    //https://leetcode.com/problems/remove-element/

    //Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    // The order of the elements may be changed.
    // Then return the number of elements in nums which are not equal to val.
    //
    //Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    //
    //Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    //The remaining elements of nums are not important as well as the size of nums.
    //Return k.

    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = nums.length - 1;

        if (val != Integer.MAX_VALUE) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val && i <= index) {
                    count++;
                } else {
                    if (i < index) {
                        nums[i] = nums[index];
                        nums[index] = Integer.MAX_VALUE;

                        index--;
                        i--;
                    } else if (i == index) {
                        nums[index] = Integer.MAX_VALUE;
                        break;
                    } else {
                        break;
                    }
                }
            }
        } else {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    count++;
                } else {
                    nums[i] = 0;
                }
            }
        }

        return count;
    }


    //This solution does not account for edge cases where the input array contains only the target value.
    // For instance if the array is [3,3] with val=3, the function will return 0 correctly,
    // however the array will continue to exist in memory as [3,3] which does not meet the requirements.
    public int removeElementMemory(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return count;
    }
}
