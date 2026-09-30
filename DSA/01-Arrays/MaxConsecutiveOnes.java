/*
Problem: Max Consecutive Ones (LeetCode 485)

Description:
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Approach:
1. Traverse the array from left to right.
2. Maintain a variable 'count' to store the current streak of consecutive 1's.
3. If the current element is 1:
   - Increment the current streak.
   - Update the maximum streak if the current streak is larger.
4. If the current element is 0:
   - Reset the current streak to 0.
5. Return the maximum streak found.

Example:
Input:
nums = [1,1,0,1,1,1]

Output:
3

Explanation:
The longest sequence of consecutive 1's is [1,1,1], whose length is 3.

Time Complexity: O(n)
Space Complexity: O(1)

Status: Completed
*/

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;

                if (count > max) {
                    max = count;
                }

            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }
}