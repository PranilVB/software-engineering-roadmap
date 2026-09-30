/*
Problem: Find All Duplicates in an Array (LeetCode 442)

Description:
Given an integer array nums of length n where all integers are in the range [1, n]
and each integer appears once or twice, return all the integers that appear twice.

Approach:
1. Use Cyclic Sort to place each number at its correct index.
   - Correct index for a number x is (x - 1).
2. While traversing the array:
   - If the current number is not at its correct position and its correct position
     contains a different number, swap them.
   - Otherwise, move to the next index.
3. After Cyclic Sort, traverse the array again.
4. If nums[i] != i + 1, then nums[i] is a duplicate.
5. Store all duplicates in an ArrayList and return it.

Example:
Input:
nums = [4,3,2,7,8,2,3,1]

After Cyclic Sort:
[1,2,3,4,3,2,7,8]

Duplicates:
[3,2]

Time Complexity: O(n)
Space Complexity: O(1)
(Note: The returned ArrayList is not counted as extra space.)

Status: Completed
*/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public static List<Integer> findDuplicates(int[] nums) {

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

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDuplicates(nums));
    }
}