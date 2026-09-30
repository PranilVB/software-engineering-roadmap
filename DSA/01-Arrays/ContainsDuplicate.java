/*
Problem:
Determine whether an array contains any duplicate element.

Approach:
Sort the array and compare adjacent elements.
If any two adjacent elements are equal, a duplicate exists.

Time Complexity: O(n log n)
Space Complexity: O(1) (ignoring sorting implementation)
*/

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        boolean found = false;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                found = true;
                break;
            }

        }

        System.out.println(found);

        sc.close();
    }
}