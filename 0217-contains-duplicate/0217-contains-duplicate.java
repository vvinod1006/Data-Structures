class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> h = new HashSet<>();
       for(int x: nums){
        h.add(x);
       }
        if(h.size()==nums.length){
            return false;
        }
        return true;
    }
   
}