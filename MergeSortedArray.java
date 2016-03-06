public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        m = m - 1;
        n = n - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (m < 0) {
                nums1[i] = nums2[n];
                n--;
            }
            else if (n < 0) {
                nums1[i] = nums1[m];
                m--;
            }
            else if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            }
            else {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }
}