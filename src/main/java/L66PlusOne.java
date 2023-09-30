import java.util.Arrays;

public class L66PlusOne {

    //66. Plus One
    //https://leetcode.com/problems/plus-one/


    public int[] plusOne(int[] digits) {
        int lastEl = digits.length - 1;
        if(digits[lastEl] == 0) {
            return new int[]{};
        }
        if (digits[lastEl] < 9) {
            digits[lastEl] += 1;
            return digits;
        } else if (digits[lastEl] == 9 && digits.length > 1) {
            for (int i = lastEl - 1; i >= 0; i--) {
                if (digits[i] != 9 && digits[i + 1] == 9) {
                    digits[i] += 1;
                    digits[i + 1] = 0;
                    return digits;
                } else {
                    digits[i + 1] = 0;
                }
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
}
