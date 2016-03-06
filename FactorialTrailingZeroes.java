public class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n>1) res += (n/=5);
        return res;
    }
}