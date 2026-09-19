class Solution {
    public String mergeAlternately(String word1, String word2) {
        char [] a= word1.toCharArray();
        char [] b = word2.toCharArray();
        String ans = "";
        int n = (a.length<b.length)?a.length:b.length;
        for(int i=0;i<n;i++){
            ans = ans+a[i]+b[i];
        }
        int i=n;
        while(i<=a.length-1){
            ans = ans+a[i];
            i++;
        }
       i = n;
        while(i<=b.length-1){
            ans = ans+b[i];
            i++;
        }
        return ans;
    }
}