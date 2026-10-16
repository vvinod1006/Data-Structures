class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        int powerOf5 = 5;
        while(n>=powerOf5){
            result = result + (n/powerOf5);
            powerOf5 *= 5;
        }
        return result;
    }
}