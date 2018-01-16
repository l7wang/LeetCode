public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        else if (nums.length <= 1) return nums.length;
        
        int forward = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                forward++;
            }
            else {
                if (forward > 0) {
                    nums[i-forward] = nums[i];
                }
            }
        }
        return nums.length-forward;
    }
}