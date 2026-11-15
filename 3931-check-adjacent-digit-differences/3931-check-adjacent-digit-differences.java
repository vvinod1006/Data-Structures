class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean ans = true;
        for (int i = 0; i <= s.length() - 2; i++) {
                int num1 = Character.getNumericValue(s.charAt(i));
                int num2 = Character.getNumericValue(s.charAt(i+1));
                int res = Math.abs(num2 - num1);
                if (res > 2) {
                    ans = false;
                    break;
                }

            

        }
        return ans;

    }
}