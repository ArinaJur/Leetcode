public class L9PalindromeNumber {
    //leetcode 9
    //https://leetcode.com/problems/palindrome-number/

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int x1 = x;
        int digits = 1;
        while(x1 >= 10) {
            x1 = x1 / 10;
            digits *= 10;
        }

        while (digits > 0) {
            if(x % 10 != x / digits) {
                return false;
            }
            x = (x % digits)/10;
            digits = digits / 100;
        }

        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x >= 0 && x < 10) return true;
        if (x < 0 || x % 10 == 0) return false;

        int y = 0;
        int num = x;

        while (num > 0) {
            y = y * 10 + num % 10;
            num /= 10;
        }

        return y == x;
    }

    public boolean isPalindrome2(int x) {
        if (x >= 0 && x < 10) return true;
        if (x < 0 || x % 10 == 0) return false;

        int temp = x;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        return reverse == x;
    }
}
