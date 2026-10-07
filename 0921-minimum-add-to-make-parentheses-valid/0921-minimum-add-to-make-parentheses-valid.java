class Solution {
    public int minAddToMakeValid(String s) {
        int add = 0;
        int sub= 0;
        char a[] = s.toCharArray();
        for(char x: a){
            if(x == '('){
            
                add++;
            }else{
                if(add > 0){
                    add--;
                }else{
                    sub++;
                }
            }
        }
            return add + sub;
    }
}