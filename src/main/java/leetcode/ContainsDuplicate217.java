package leetcode;

import java.util.HashSet;
import java.util.Set;

//217. Contains Duplicate
//        Easy
//        7.5K
//        1.1K
//        Companies
//        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1]
//        Output: true
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//        Output: false
//        Example 3:
//
//        Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        -109 <= nums[i] <= 109

public class ContainsDuplicate217 {

    // https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                return true;
            }
            result.add(nums[i]);
        }
        return false;
    }

    // [1,1,1,3,3,4,3,2,4,2]
    public static void main(String[] args) {
        ContainsDuplicate217 containsDuplicate217 = new ContainsDuplicate217();
        System.out.println(containsDuplicate217.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}

