/*
Problem: Shuffle the Array (LeetCode 1470)

Description:
Given an array nums consisting of 2n elements in the form:
[x1, x2, ..., xn, y1, y2, ..., yn]

Return the array in the form:
[x1, y1, x2, y2, ..., xn, yn]

Approach:
1. Split the original array into two equal halves.
2. Store the first half in firstHalf[] and the second half in secondHalf[].
3. Traverse the original array.
4. Fill even indices with elements from firstHalf.
5. Fill odd indices with elements from secondHalf.
6. Use integer division (i / 2) to map output indices to the correct position
   in the temporary arrays.

Example:
Input:
nums = [2,5,1,3,4,7], n = 3

First Half  = [2,5,1]
Second Half = [3,4,7]

Output:
[2,3,5,4,1,7]

Time Complexity: O(n)
Space Complexity: O(n)

Status: Completed
*/

import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {

        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];

        // Split the array into two halves
        for (int i = 0; i < n; i++) {
            firstHalf[i] = nums[i];
            secondHalf[i] = nums[i + n];
        }

        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                nums[i] = firstHalf[i / 2];
            } else {
                nums[i] = secondHalf[i / 2];
            }

        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};

        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}