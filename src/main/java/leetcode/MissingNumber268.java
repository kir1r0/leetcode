package leetcode;

// https://leetcode.com/problems/missing-number/

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//
//
//        Example 1:
//
//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//        Example 2:
//
//        Input: nums = [0,1]
//        Output: 2
//        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//        Example 3:
//
//        Input: nums = [9,6,4,2,3,5,7,0,1]
//        Output: 8
//        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 104
//        0 <= nums[i] <= n
//        All the numbers of nums are unique.

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            sum += num;
        }

        return n * (n + 1) / 2 - sum;
    }

    public static void main(String[] args) {
        MissingNumber268 ms = new MissingNumber268();
        int missingNumber = ms.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(missingNumber);
        if (missingNumber != 8) {
            throw new IllegalStateException("Wrong answer");
        }
    }
}
