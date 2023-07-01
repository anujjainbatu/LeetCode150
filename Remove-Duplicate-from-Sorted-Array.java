class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        if (nums.length == 1) {
            index++;
            return index;
        }
        for (int i = 0; i < nums.length-1; i++) {
            nums[index] = nums[i];
            index++;
            while (i < nums.length-1 && nums[i] == nums[i+1]) {
                i++;
            }
        }
        if (nums.length > 1 && nums[nums.length-1] != nums[nums.length-2]) {
            nums[index] = nums[nums.length-1];
            index++;
        }
        return index;
    }
}
