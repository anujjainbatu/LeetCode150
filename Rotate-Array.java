class Solution {
    public static void reverse(int[] nums, int start,int end) {
        while (end>start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k %= l; 
        reverse(nums, 0, l-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, l-1);
    }
}

/*last k in front with reverse order
rest shifted by k in given order(rev ka rev = normal)
eg- 1,2,3,4,5,6,7 rotate 3 times
7,6,5,4,3,2,1
5,6,7, || 4,3,2,1
5,6,7, || 1,2,3,4*/
//line 14 to avoid repeaded rotation for eg size 2 rotate 5 times is rotate 1 time
