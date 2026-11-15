class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean ans = true;
        for (int i = 0; i <= s.length() - 2; i++) {
            int res = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if (res > 2) {
                ans = false;
                break;
            }
        }
        return ans;

    }
}