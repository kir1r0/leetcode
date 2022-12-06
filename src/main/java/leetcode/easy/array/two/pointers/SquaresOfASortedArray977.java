package leetcode.easy.array.two.pointers;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//        Example 1:
//
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
//        Example 2:
//
//        Input: nums = [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//        nums is sorted in non-decreasing order.
//
//
//        Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int [] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray977 squares = new SquaresOfASortedArray977();
        int[] ints = squares.sortedSquares(new int[]{-7, -3, 2, 3, 11});
        List<Integer> list = new ArrayList<>();
        for (int i : ints) {
            list.add(i);
        }
        list.forEach(System.out::println);
    }
}
