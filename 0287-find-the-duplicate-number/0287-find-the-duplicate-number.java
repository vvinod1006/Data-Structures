import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
    //     HashMap<Integer,Integer> h = new HashMap<>();
    //     for(int x:nums){
    //         h.put(x,h.getOrDefault(x,0)+1);
    //     }
    // for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
    //         Integer key = entry.getKey();
    //         Integer value = entry.getValue();
    //         if(value>1){
    //         return key;
    //     }
           
    //     }
    //    return -1;

    HashSet<Integer> s = new HashSet<>();
    for(int x:nums){
        if(s.contains(x)){
            return x;
        }else{
            s.add(x);
        }
    }
        return -1;
    }
}