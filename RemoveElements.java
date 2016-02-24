public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length < 1 || nums == null) return 0;
        int forward = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                forward++;
                continue;
            }
            if (forward > 0) {
                int temp = nums[i-forward];
                nums[i-forward] = nums[i];
                nums[i] = temp;
            }
        }
        return nums.length-forward;
    }
}