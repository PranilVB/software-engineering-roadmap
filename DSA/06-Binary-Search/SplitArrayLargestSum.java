/*
Problem:
Split Array Largest Sum (LeetCode 410)

Given an integer array and an integer k, split the array into k non-empty
continuous subarrays such that the largest subarray sum is minimized.

Approach:
Binary Search on Answer

- The minimum possible answer is the largest element in the array.
- The maximum possible answer is the sum of all elements.
- Binary search this range.
- For each candidate maximum sum (mid), count how many subarrays are needed.
- If more than k subarrays are required, increase the answer.
- Otherwise, try a smaller answer.

Time Complexity: O(n * log(sum))
Space Complexity: O(1)

Status: Solved
*/

public class SplitArrayLargestSum {

    public static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {

            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {

                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }

            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        System.out.println("Minimum Largest Sum : " + splitArray(nums, k));
    }
}
