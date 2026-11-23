class Solution {
    public int alternatingSum(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i=0;i<=nums.length-1;i+=2){
            even = even + nums[i];
        }
        for(int i=1;i<=nums.length-1;i+=2){
            odd = odd + nums[i];
        }
        return even - odd;
    }
}