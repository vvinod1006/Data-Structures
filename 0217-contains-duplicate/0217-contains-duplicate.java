class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        // for(int x:nums){
        //     int count = h.getOrDefault(x,0);
        //     count++;
        //     h.put(x,count);
        // }
        // for(int x: nums){
        //     if(h.get(x)>1){
        //         return true;
        //     }
        // }
        // return false;
        for(int num:nums){
    if(map.containsKey(num)){
            return true;
        }
        map.put(num,1);
        }
    
return false;
    }
   
}