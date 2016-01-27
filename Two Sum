public class Solution {
    // First try
    public int[] twoSum(int[] nums, int target) {
        int[] solution = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j= i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    solution[0] = i+1;
                    solution[1] = j+1;
                    return solution;
                }
            }
        }
    return solution;    
    }

    // Second try
    public int[] twoSum(int[] nums, int target) {
       int[] solution = {0,0};
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(nums[i])) {
               solution[0] = map.get(nums[i]) + 1;
               solution[1] = i + 1;
               return solution;
           }
           else {
               map.put(target-nums[i], i);
           }
       }
       return solution;
   }
}