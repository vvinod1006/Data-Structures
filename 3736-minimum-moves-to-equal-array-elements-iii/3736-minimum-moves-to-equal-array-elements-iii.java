class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<=nums.length-2;i++){
            int result = nums[nums.length-1]-nums[i];

            sum = sum+result;
        }
        return sum;
    }
}