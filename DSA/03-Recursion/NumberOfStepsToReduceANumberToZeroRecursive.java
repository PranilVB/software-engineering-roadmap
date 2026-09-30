/*
Problem: Number of Steps to Reduce a Number to Zero (LeetCode 1342)

Description:
Given an integer num, return the number of steps required to reduce it to zero.

Rules:
1. If the current number is even, divide it by 2.
2. If the current number is odd, subtract 1.
3. Repeat until the number becomes 0.

Approach:
1. Use a helper recursive function with two parameters:
   - num: current number
   - count: number of steps taken so far
2. Base Case:
   - If num becomes 0, return count.
3. Recursive Case:
   - If num is even, recursively call with num / 2.
   - If num is odd, recursively call with num - 1.
   - Increment count before each recursive call.

Example:
Input:
num = 14

Execution:
14 → 7 → 6 → 3 → 2 → 1 → 0

Steps:
6

Output:
6

Time Complexity: O(log n)
Space Complexity: O(log n)   // Recursive call stack

Note:
This is a Tail Recursive solution because the recursive call is the final operation in the function.

Status: Completed
*/

public class NumberOfStepsToReduceANumberToZeroRecursive {

    public static int numberOfSteps(int num) {

        return steps(num, 0);
    }

    private static int steps(int num, int count) {

        if (num == 0) {
            return count;
        }

        if (num % 2 == 0) {
            return steps(num / 2, count + 1);
        }

        return steps(num - 1, count + 1);
    }

    public static void main(String[] args) {

        int num = 14;

        System.out.println(numberOfSteps(num));
    }
}
```