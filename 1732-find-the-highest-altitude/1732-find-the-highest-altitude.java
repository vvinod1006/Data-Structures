class Solution {
    public int largestAltitude(int[] gain) {
        int temp = 0;
        int count = 0;
        for(int i=0;i<=gain.length-1;i++){
            count = count + gain[i];

            if(count>temp){
                temp = count;
            }
        }
        return temp;
        
    }
}