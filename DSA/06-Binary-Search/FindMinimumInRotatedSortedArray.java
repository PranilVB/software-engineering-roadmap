/*
Problem:
Find the minimum element in a rotated sorted array.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int start = 0;
        int end = nums.length - 1;
        int ans = nums[0];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Array is already sorted
            if (nums[start] <= nums[mid] && nums[mid] <= nums[end]) {
                ans = nums[start];
                break;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            }
            // Right half is sorted
            else {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }

        System.out.println("Minimum Element = " + ans);
    }
}