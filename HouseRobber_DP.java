public class Solution {
    public int rob(int[] nums) {
        if (nums == null) return 0;
        else if (nums.length == 1) return nums[0];
        
        // memo[i][0] means house i is not broken, memo[i][1] means house i is broken.
        int[][] memo = new int[nums.length + 1][2];
        for (int i = 1; i <= nums.length; i++) {
            memo[i][0] = Math.max(memo[i-1][1], memo[i-1][0]);
            memo[i][1] = nums[i-1] + memo[i-1][0];
        }
        return Math.max(memo[nums.length][0], memo[nums.length][1]);
    }
}