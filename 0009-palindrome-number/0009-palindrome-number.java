class Solution {
    public boolean isPalindrome(int x) {
        int count = 0;
        int save = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int r= x%10;
            x= x/10;
            count = count*10+r;
        }
       return count == save;
    }
}