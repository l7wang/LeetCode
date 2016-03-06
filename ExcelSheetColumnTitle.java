public class Solution {
    public String convertToTitle(int n) {
        String res = "";
        while (n != 0) {
            char c = (char)(65 + (n - 1) % 26);
            n = (n - 1) / 26;
            res = c + res;
        }
        return res;
    }
}