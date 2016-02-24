public class Solution {
	// First try
	public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return (n == 1);
    }

    // Second try
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return ((n & n-1) == 0);
    }
}