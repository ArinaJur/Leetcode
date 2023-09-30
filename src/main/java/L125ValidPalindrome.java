
public class L125ValidPalindrome {

    //125. Valid Palindrome
    //https://leetcode.com/problems/valid-palindrome/

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return false;
        s = s.trim().toLowerCase().replaceAll("[^\\p{L}\\p{Nd}]+", "");
        if(s.length() > 1) {
            for(int i = 0; i < s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
