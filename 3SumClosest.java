public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3 && nums == null) return 0;
        
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int closest = 0;
        
        for (int i = 0; i < nums.length-2; i++) {
            int start = i+1, end = nums.length-1;
            while (start < end) {
                if (nums[i]+nums[start]+nums[end] == target) return target;
                else if (nums[i]+nums[start]+nums[end] > target) {
                    if (nums[i]+nums[start]+nums[end] - target < diff) {
                        diff = nums[i]+nums[start]+nums[end] - target;
                        closest = nums[i]+nums[start]+nums[end];
                    }
                    end--;
                }
                else {
                    if (target - nums[i]-nums[start]-nums[end] < diff) {
                        diff = target - nums[i]-nums[start]-nums[end];
                        closest = nums[i]+nums[start]+nums[end];
                    }
                    start++;
                }
            }
        }
        
        return closest;
    }
}