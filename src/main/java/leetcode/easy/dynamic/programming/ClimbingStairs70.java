package leetcode.easy.dynamic.programming;

//You are climbing a staircase. It takes n steps to reach the top.
//
//        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
//
//        Example 1:
//
//        Input: n = 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps
//        Example 2:
//
//        Input: n = 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step
//
//
//        Constraints:
//
//        1 <= n <= 45
public class ClimbingStairs70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prevStep = 1;
        int currentStep = 2;
        for (int i = 2; i < n; i++) {
            int tmp = currentStep;
            currentStep = currentStep + prevStep;
            prevStep = tmp;
        }
        return currentStep;
    }

    // too long
    public int climbStairsRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
    }

    public static void main(String[] args) {
        ClimbingStairs70 climbingStairs = new ClimbingStairs70();
        System.out.println(climbingStairs.climbStairs(45));
        System.out.println(climbingStairs.climbStairsRecursion(45));
    }
}
