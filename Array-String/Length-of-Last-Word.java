class Solution {
    public int lengthOfLastWord(String s) {
        int idx_end = 0;
        int j = s.length()-1;

        while (s.charAt(j) == ' ') {
            j--;
        }
        idx_end = j;

        for (int i = idx_end; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return idx_end - i;
            }
            else if (i == 0) {
                return idx_end + 1;
            }
        }
        return s.length();
    }
}
