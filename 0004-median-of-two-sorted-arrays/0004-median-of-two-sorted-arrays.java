class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
       
 int[] nums3 = new int[nums1.length + nums2.length];

int k = 0;
for(int x : nums1) nums3[k++] = x;
for(int x : nums2) nums3[k++] = x;

Arrays.sort(nums3);

int n = nums3.length;

if(n % 2 == 1){
    return nums3[n / 2];
}else{
    return (nums3[n / 2 - 1] + nums3[n / 2]) / 2.0;
}
    }
}