public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maxHere = nums[0], minHere = nums[0], maxRes = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                maxHere = Math.max(maxHere * nums[i], nums[i]);
                minHere = Math.min(minHere * nums[i], nums[i]);
            }
            else {
                int temp = maxHere;
                maxHere = Math.max(minHere * nums[i], nums[i]);
                minHere = Math.min(temp * nums[i], nums[i]);
            }
            maxRes = Math.max(maxHere, maxRes);
        }
        return maxRes;
    }
}