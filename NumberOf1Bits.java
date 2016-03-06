public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int acc = 0;
        for (int i = 0; i < 32; i++) {
            if ((n >> i & 1) != 0) acc++;
        }
        return acc;
    }
}