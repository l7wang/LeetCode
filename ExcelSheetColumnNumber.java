public class Solution {
    public int titleToNumber(String s) {
        char[] charList = s.toCharArray();
        int res = 0;
        for (int i = 0; i < charList.length; i++) {
            res = res * 26 + charList[i] - 'A' + 1;
        }
        return res;
    }
}