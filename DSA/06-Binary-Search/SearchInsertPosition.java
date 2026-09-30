/*
Problem: Search Insert Position (LeetCode 35)

Description:
Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be inserted in
order.

Approach:
1. Apply Binary Search on the sorted array.
2. Calculate the middle index.
3. If the target is found, return its index.
4. If the target is greater than the middle element, search the right half.
5. Otherwise, search the left half.
6. If the target is not found, the 'start' pointer will indicate the correct
   insertion position.

Example:
Input:
nums = [1,3,5,6], target = 5
Output:
2

Input:
nums = [1,3,5,6], target = 2
Output:
1

Input:
nums = [1,3,5,6], target = 7
Output:
4

Time Complexity: O(log n)
Space Complexity: O(1)

Status: Completed
*/

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        System.out.println(searchInsert(nums, 5)); // 2
        System.out.println(searchInsert(nums, 2)); // 1
        System.out.println(searchInsert(nums, 7)); // 4
        System.out.println(searchInsert(nums, 0)); // 0
    }
}
