class Solution {
    public boolean uniformArray(int[] nums1) {
        // int [] nums2 = new int[nums1.length];
        // int even = 0;
        // int odd = 0;
        // for(int i =0;i<=nums1.length-1;i++){
        //    for(int j=1;j<=nums1.length-1;j++){
        //     if(j!=i){
        //         nums2[i++] = nums1[i]-nums1[j];
        //     }else{
        //         nums2[i++] = nums1[i];
        //     }
        //    }
        // }
        // for(int i=0;i<=nums2.length-1;i++){
        //     if(nums2[i] % 2 == 0){
        //         even ++;
        //     }else{
        //         odd ++;
        //     }
        // }
        // return even == nums2.length || odd == nums2.length;
        return true;
    }
}