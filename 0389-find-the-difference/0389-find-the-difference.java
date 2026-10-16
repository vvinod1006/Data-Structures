class Solution {
    public char findTheDifference(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        int len = s1.length < t1.length ? s1.length : t1.length;
        for (int i = 0; i < len ; i++) {
            if (s1[i] != t1[i]) {
                return t1[i];
            }
        }
        return t1[t1.length - 1];
    }
}