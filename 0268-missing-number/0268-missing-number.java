class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int x:nums){
            ans = ans^x;
        }
        for(int i=1;i<=n;i++){
            ans = ans ^ i;
        }
        return ans;
    }
}