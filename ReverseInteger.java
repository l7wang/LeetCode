public class Solution {
    public int reverse(int x) {
        // Use double because the reverse might overflow
        double result = 0;
        
        while (x != 0) {
            result = result*10 + (x % 10);
            x = x / 10;
        }
        
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        
        return (int)result;
    }
}