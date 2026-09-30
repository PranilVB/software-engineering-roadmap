/*
Problem: Number of Steps to Reduce a Number to Zero (LeetCode 1342)

Description:
Given an integer num, return the number of steps required to reduce it to zero.

Rules:
1. If the current number is even, divide it by 2.
2. If the current number is odd, subtract 1 from it.
3. Continue until the number becomes 0.

Approach:
1. Initialize a counter to 0.
2. Repeat until num becomes 0:
   - If num is odd, subtract 1.
   - Otherwise, divide it by 2.
   - Increment the counter.
3. Return the counter.

Example:
Input:
num = 14

Steps:
14 → 7 → 6 → 3 → 2 → 1 → 0

Output:
6

Time Complexity: O(log n)
Space Complexity: O(1)

Status: Completed
*/

public class NumberOfStepsToReduceANumberToZero {

    public static int numberOfSteps(int num) {

        int count = 0;

        while (num >= 0) {

            if (num == 0) {
                return count;
            } else if (num % 2 != 0) {
                num--;
                count++;
            } else {
                num = num / 2;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int num = 14;

        System.out.println(numberOfSteps(num));
    }
}