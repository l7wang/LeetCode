public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList<List<Integer>>();
        
        if (nums.length < 3 || nums == null) return result;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            // Avoid the same result
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int start = i+1;
            int end = nums.length-1;
            
            while (start<end) {
                if (-nums[i] == nums[start]+nums[end]) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start+1] == nums[start]) start++;
                    start++;
                    while (start < end && nums[end-1] == nums[end]) end--;
                    end--;
                }
                else if (-nums[i] < nums[start]+nums[end]) end--;
                else if (-nums[i] > nums[start]+nums[end]) start++;
            }
        }
        
        return result;
    }
}