class Solution {
    public boolean isPalindrome(String s) {
        String str = new String(s.toLowerCase().replaceAll("[^a-z0-9]",""));
        StringBuilder rev = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        if (str.equals(rev.toString())) {
            return true;
        }
        return false;
    }
}
