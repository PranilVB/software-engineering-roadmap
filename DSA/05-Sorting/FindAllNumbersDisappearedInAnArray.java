/*
Problem: Find All Numbers Disappeared in an Array (LeetCode 448)

Description:
Given an integer array nums of length n where all integers are in the range [1, n]
and some elements appear twice while others appear once, return all the integers
in the range [1, n] that do not appear in nums.

Approach:
1. Use Cyclic Sort to place each number at its correct index.
   - Correct index for a number x is (x - 1).
2. While traversing the array:
   - If the current number is not at its correct position and its correct position
     contains a different number, swap them.
   - Otherwise, move to the next index.
3. After sorting, traverse the array again.
4. If nums[i] != i + 1, then (i + 1) is the missing number.
5. Store all missing numbers in an ArrayList and return it.

Example:
Input:
nums = [4,3,2,7,8,2,3,1]

After Cyclic Sort:
[1,2,3,4,3,2,7,8]

Missing Numbers:
[5,6]

Time Complexity: O(n)
Space Complexity: O(1)
(Note: The returned ArrayList is not counted as extra space.)

Status: Completed
*/

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int k = 0; k < nums.length; k++) {

            if (nums[k] != k + 1) {
                ans.add(k + 1);
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDisappearedNumbers(nums));
    }
}