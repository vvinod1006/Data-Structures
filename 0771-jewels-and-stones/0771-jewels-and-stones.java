class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0;i<=stones.length()-1;i++){
            for( int j=0;j<=jewels.length()-1;j++){
                if(jewels.charAt(j)==stones.charAt(i)){
                    count++;
                }
            }    
        }
        return count;

    }
}