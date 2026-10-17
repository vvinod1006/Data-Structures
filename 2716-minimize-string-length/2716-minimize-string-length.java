class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(char x : s.toCharArray()){
            hs.add(x);
        }
        return hs.size();
    }
}