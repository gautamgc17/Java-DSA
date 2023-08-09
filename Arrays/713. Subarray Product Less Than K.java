// Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        long product = 1;

        int i = 0;
       for(int j=0; j<nums.length; j++){
           product *= nums[j];
           while((product>=k) && (i <= j)){
                product /= nums[i];
                i++;
            }
           if(product < k){
               // increase the upper bound
               ans += (j-i+1);
           }
       } 
       return ans;
    }
}