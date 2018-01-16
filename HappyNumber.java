public class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> existed = new ArrayList<Integer>();
        existed.add(n);
        while (n != 1) {
            int res = 0;
            while (n != 0) {
                res = res + (n % 10)*(n % 10);
                n = n / 10;
            }
            if (existed.contains(res)) return false;
            existed.add(res);
            n = res;
        }
        return true;
    }
}