class Solution {
    public int thirdMax(int[] nums) {
        int arr[] = Arrays.stream(nums).distinct().sorted().toArray();
         
        if(arr.length >= 3){
            return arr[arr.length-3];
        }else{
            return arr[arr.length-1];
        }
       
        
    }
}