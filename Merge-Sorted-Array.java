class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else {
                for(int l = m-1; l >= k; l--){
                    nums1[l+1] = nums1[l];
                }
                nums1[k] = nums2[j];
                m++;
                j++;
                i++;
            }
            k++;
        }

        while(j < n) {
            nums1[k] = nums2[j];
            m++;
            j++;
            k++;
        }
    }
}
