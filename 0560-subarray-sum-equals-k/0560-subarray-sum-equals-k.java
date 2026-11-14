class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            int currentSum = 0;
            for (int j = i; j <=nums.length-1; j++) {
                currentSum += nums[j];
                if (currentSum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
