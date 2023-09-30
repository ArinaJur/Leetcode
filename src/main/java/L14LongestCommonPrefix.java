public class L14LongestCommonPrefix {
    //14. Longest Common Prefix
    //https://leetcode.com/problems/longest-common-prefix/

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 1) {
            return strs[0];
        } else {
            int minLength = 200;
            for (String str : strs) {
                if (minLength != 0 && str.length() < minLength) {
                    minLength = str.length();
                    result = str;
                }
            }

            if (minLength > 0) {
                 for (String str : strs) {
                     if (!str.equals(result)) {
                         for (int i = 0; i < result.length(); i ++) {
                             if (result.charAt(i) != str.charAt(i)) {
                                 result = result.substring(0, i);
                                 if (result.isEmpty()) {
                                     return result;
                                 }
        }}}}}}

        return result;
    }
}
