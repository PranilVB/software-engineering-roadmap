/*
Problem: Missing Number (LeetCode 268)

Description:
Given an array containing n distinct numbers in the range [0, n],
return the only number missing from the array.

Approach:
- Use Cyclic Sort.
- Every value x belongs at index x.
- The only value that cannot be placed is n,
  because the last valid index is n-1.
- After placing all possible numbers correctly,
  the first index where value != index is the missing number.

Time Complexity: O(n)
Space Complexity: O(1)

Status: Completed
*/

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int index = 0;

        while (index < nums.length) {

            int correct = nums[index];

            if (nums[index] < nums.length && nums[index] != nums[correct]) {

                int temp = nums[index];
                nums[index] = nums[correct];
                nums[correct] = temp;

            } else {
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        System.out.println("Missing Number: " + missingNumber(nums));
    }
}			