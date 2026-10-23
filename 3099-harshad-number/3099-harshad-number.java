class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;
        int save = x;
        while(x!=0){
            int r = x%10;
            x=x/10;
            sum = sum+r;
        }
        if(save % sum ==0){
            return sum;
        }
        return -1;       
    }
}