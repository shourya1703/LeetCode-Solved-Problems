class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[n + m];
        int p1 = 0, p2 = 0, p3 =  0;
        while(p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                ans[p3 ++] = nums1[p1 ++];
            } else {
                ans[p3 ++] = nums2[p2 ++];
            }
        }
        while(p1 < m) {
            ans[p3 ++] = nums1[p1 ++];
        }
        while(p2 < n) {
            ans[p3 ++] = nums2[p2 ++];
        }
        for(int i = 0; i < ans.length; i ++) {
            nums1[i] = ans[i];
        }
    }
}