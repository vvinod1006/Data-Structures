class Solution {
    public String truncateSentence(String s, int k) {
    //    String words [] =  s.split(" ");
    //    String ans = "";
    //    for(int i=0;i<k;i++){
    //         ans = ans+words[i]+" ";
    //    }
    //    return ans.trim();
        int count = 0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i) == ' '){
                count++;
            }
            if(count == k){
                return s.substring(0,i);
            }
        }
        return s;
    }
}