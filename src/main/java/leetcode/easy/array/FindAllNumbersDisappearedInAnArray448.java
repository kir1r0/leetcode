package leetcode.easy.array;

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//        Example 1:
//
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]
//        Example 2:
//
//        Input: nums = [1,1]
//        Output: [2]
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 105
//        1 <= nums[i] <= n

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {

    //    Input: nums = [4,3,2,7,8,2,3,1]
//    Output: [5,6]
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int pos = nums[i] - 1;
            if (nums[i] != nums[pos]) {
                int tmp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = tmp;
                // printArray(nums, i);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            int pos = nums[j] - 1;
            if (j != pos) {
                result.add(j + 1);
            }
        }
        return result;
    }

    void printArray(int[] nums, int step) {
        System.out.println(step + ": *********************");
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray448 target = new FindAllNumbersDisappearedInAnArray448();
        List<Integer> numbers = target.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println("Answer");
        numbers.forEach(System.out::println);
    }
}
