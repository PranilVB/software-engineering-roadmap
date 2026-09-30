/*
Problem:
Search an element in a sorted array using Binary Search.

Approach:
Repeatedly divide the search space into two halves.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                sc.close();
                return;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        System.out.println("Element not found.");

        sc.close();
    }
}