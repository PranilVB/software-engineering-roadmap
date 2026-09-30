/*
Problem: Missing Number (LeetCode 268)

Description:
Given an array containing n distinct numbers in the range [0, n],
return the only number missing from the array.

Approach:
- Calculate the expected sum of numbers from 1 to n.
- Subtract every element of the array from this sum.
- The remaining value is the missing number.

Example:
nums = [3, 0, 1]

Expected Sum = 1 + 2 + 3 = 6
Actual Sum = 3 + 0 + 1 = 4

Missing Number = 6 - 4 = 2

Time Complexity: O(n)
Space Complexity: O(1)

Status: Completed

*/

public class MissingNumberSum {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = 0;
        for (int i = 1; i <= n; i++) {
            expectedSum += i;
        }

        int missing = expectedSum;
        for (int num : nums) {
            missing -= num;
        }

        return missing;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        System.out.println("Missing Number: " + missingNumber(nums));
    }
}