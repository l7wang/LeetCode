public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int longest = 1, start = 0, end = 1;
        String current = s.substring(start, end);
        for (int i = end; i < s.length(); i++) {
            if (current.indexOf(s.charAt(i)) < 0) {
                end++;
                current = s.substring(start, end);
                if (end - start > longest) longest = end - start;
            }
            else {
                if (end - start > longest) longest = end - start;
                start = start + current.indexOf(s.charAt(i)) + 1;
                end++;
                current = s.substring(start, end);
            }
        }
        if (end - start > longest) longest = end - start;
        return longest;
    }
}