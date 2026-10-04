class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int one = nums[nums.length-1]; 
        int two = nums[nums.length-2];
        int ans = (one -1) * (two -1);
        return ans;
        
    }
}