class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        char [] ch = s.toCharArray();

        for(char i=0;i<=ch.length-1;i++){
            if(ch[i] == 'L'){
                count --;
            }else{
                count ++;
            }
            if(count == 0){
                res ++;
            }
        }

        return res;
        
    }
}