// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // check if target value for current element exist in hashmap
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int current = target - nums[i];
            if (map.containsKey(current)){
                return new int[]{i, map.get(current)};
            }
            else{
                // insert the number at its index
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}