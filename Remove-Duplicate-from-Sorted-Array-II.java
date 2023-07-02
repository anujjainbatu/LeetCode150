class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int i = 0;
        while (i < nums.length) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                else {
                    break;
                }
            }
            if (count > 1) {
                nums[index] = nums[i];
                nums[index+1] = nums[i+1];
                index += 2;
            }
            else {
                nums[index] = nums[i];
                index++;
            }
            i += count;
        }
        return index;
    }
}
