class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h= new HashMap<>();

        for (int i=0;i< nums.length; i++) {
            int val = nums[i];
            if (h.containsKey(val) && i-h.get(val) <= k) {
                return true;
            }
            h.put(val, i);
        }

        return false;        
    }
}