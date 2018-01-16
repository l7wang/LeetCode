public class Solution {
    public boolean isPalindrome(int x) {
        // First try
        if (x == 0) return true;
        if (x < 0) return false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (x != 0) {
            int i = x % 10;
            list.add(i);
            x = x / 10;
        }
        int start = 0;
        int end = list.size()-1;
        while (start < end) {
            if (list.get(start) != list.get(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}