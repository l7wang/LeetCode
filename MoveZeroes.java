public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2 || nums == null) return;
        int forward = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                forward++;
                continue;
            } 
            if (forward > 0) {
                nums[i - forward] = nums[i];
                nums[i] = 0;
            }
        }
    }
}