/*
Problem: Set Mismatch (LeetCode 645)

Description:
You have a set containing numbers from 1 to n. Due to an error,
one number appears twice while another number is missing.
Return the duplicate number and the missing number.

Approach:
1. Apply Cyclic Sort.
   - Every number x belongs at index (x - 1).
2. Traverse the array:
   - If the current number is not at its correct position and its
     correct position contains a different number, swap them.
   - Otherwise, move to the next index.
3. After Cyclic Sort, traverse the array again.
4. The first index where nums[i] != i + 1 indicates:
   - nums[i] is the duplicate number.
   - i + 1 is the missing number.
5. Return the result as [duplicate, missing].

Example:
Input:
nums = [1,2,2,4]

After Cyclic Sort:
[1,2,2,4]

Output:
[2,3]

Time Complexity: O(n)
Space Complexity: O(1)

Status: Completed
*/

public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {

                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;

            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }

        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        int[] ans = findErrorNums(nums);

        System.out.println("Duplicate: " + ans[0]);
        System.out.println("Missing  : " + ans[1]);
    }
}
