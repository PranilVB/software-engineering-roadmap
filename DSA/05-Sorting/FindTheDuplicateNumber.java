/*
Problem: Find the Duplicate Number (LeetCode 287)

Description:
Given an array nums containing n + 1 integers where each integer is in the
range [1, n] inclusive, there is only one repeated number. Return the duplicate
number.

Approach:
1. Use the Cyclic Sort concept to place every number at its correct index.
   - Correct index for a number x is (x - 1).
2. Traverse the array:
   - If the current number is not at its correct position and the correct
     position contains a different value, swap them.
   - Otherwise, move to the next index.
3. After the cyclic sort, traverse the array again.
4. The first index where nums[i] != i + 1 indicates that nums[i] is the
   duplicate number.

Example:
Input:
nums = [3,1,3,4,2]

After Cyclic Sort:
[1,2,3,4,3]

Output:
3

Time Complexity: O(n)
Space Complexity: O(1)

Note:
This solution modifies the input array. Although it correctly demonstrates the
Cyclic Sort technique, it does NOT satisfy LeetCode 287's constraint of keeping
the array unmodified. The officially accepted optimal solution uses Floyd's
Cycle Detection algorithm.

Status: Completed
*/

public class FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {

        int n = nums.length;
        int i = 0;

        while (i < n) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {

                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;

            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {

            if (nums[j] != j + 1) {
                return nums[j];
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(findDuplicate(nums));
    }
}