public class Solution {
    public int lengthOfLastWord(String s) {
        // First try
        s = s.trim();
        int length = 0;
        for (int i = s.length(); i > 0; i--) {
            if (!(s.charAt(i-1) == ' ')) {
                length++;
            }
            else break;
        }
        return length;

        // Second try
        s = s.trim();
        int length = s.length() - s.lastIndexOf(" ") - 1;
    }
}