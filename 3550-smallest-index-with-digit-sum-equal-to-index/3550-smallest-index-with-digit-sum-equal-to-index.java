class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            int sum = 0;
            while (nums[i] > 0) {
                int r = nums[i] % 10;
                nums[i] = nums[i] / 10;
                sum = sum + r;

            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}