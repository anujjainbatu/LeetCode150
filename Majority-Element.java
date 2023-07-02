class Solution {
    public int majorityElement(int[] nums) {
        int major_mark = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > major_mark) {
                return nums[i];
            }
        }
        return 0;
    }
}

//assume that the majority element always exists in the array.
