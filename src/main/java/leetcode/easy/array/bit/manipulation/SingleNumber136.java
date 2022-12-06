package leetcode.easy.array.bit.manipulation;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [2,2,1]
//        Output: 1
//        Example 2:
//
//        Input: nums = [4,1,2,1,2]
//        Output: 4
//        Example 3:
//
//        Input: nums = [1]
//        Output: 1
//
//
//        Constraints:
//
//        1 <= nums.length <= 3 * 104
//        -3 * 104 <= nums[i] <= 3 * 104
//        Each element in the array appears twice except for one element which appears only once.

// https://leetcode.com/problems/single-number/

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int mask = 0;
        for (int num : nums) {
            mask ^= num; // XOR
        }
        return mask;
    }

    public static void main(String[] args) {
        SingleNumber136 singleNumber = new SingleNumber136();
        int number = singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2});
        System.out.println(number);
    }
}
