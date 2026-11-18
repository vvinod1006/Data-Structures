class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (2 * n) + (3 * n);
        if (s.length() != 9) {
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (ch == '0' || set.contains(ch)) {
                return false;
            }

            set.add(ch);
        }

        return set.size() == 9;
    }
}