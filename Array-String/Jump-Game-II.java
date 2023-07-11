class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int current = 0;
        int reachable = 0;
        int no_of_jumps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (current == reachable && reachable >= nums.length-1) break;
            reachable = Math.max(reachable,i + nums[i]);
            if (i == current) {
                current = reachable;
                no_of_jumps++;
            }
        }
        return no_of_jumps;
    }
}
