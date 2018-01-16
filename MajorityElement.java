public class Solution {
    public int majorityElement(int[] nums) {
        // First try
        Arrays.sort(nums);
        return nums[nums.length/2];
        
        // Second try
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count++;
            }
            else if (major == nums[i]) count++;
            else count--;
        }
        return major;
    }
}