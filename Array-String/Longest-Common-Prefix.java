class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        char temp = strs[0].charAt(0);
        int i = 0;
        while (i < strs.length) {
            if (temp != strs[i].charAt(0)) {
                break;
            }
            i++;
        }
        if (i == strs.length) {
            result.append(temp);
        }
        return result.toString();
    }
}
