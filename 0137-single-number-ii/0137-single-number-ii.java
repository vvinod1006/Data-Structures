class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer,Integer> h = new HashMap<>();
    int num = 0;
    for(int x: nums){
        h.put(x,h.getOrDefault(x,0)+1);
    }
    for(int x:h.keySet()){
        if(h.get(x)==1){
            num=x;
        }
    }
    return num;
    }
}