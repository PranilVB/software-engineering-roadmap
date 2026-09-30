/*
Problem: Concatenation of Array (LeetCode 1929)

Description:
Given an integer array nums of length n,
create an array ans of length 2n where:

ans[i] = nums[i]
ans[i + n] = nums[i]

Approach:
- Create a new array of size 2 * n.
- Traverse the original array once.
- Copy each element to:
    1. Its original position.
    2. The corresponding position in the second half.

Example:
nums = [1,2,3]

ans = [1,2,3,1,2,3]

Time Complexity: O(n)
Space Complexity: O(n)

Status: Completed
*/

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int[] ans = getConcatenation(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}