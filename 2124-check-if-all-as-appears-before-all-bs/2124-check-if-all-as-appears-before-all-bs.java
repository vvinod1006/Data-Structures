class Solution {
    public boolean checkString(String s) {
        char c[] = s.toCharArray();
        char s1[] = s.toCharArray();
        Arrays.sort(c);
        boolean ans = true;
        for(int i=0;i<=c.length-1;i++){
            if(c[i]!=s1[i]){
                ans = false;
               break;
            }else{
                ans=true;
            }
        }
        return ans;
    }
}