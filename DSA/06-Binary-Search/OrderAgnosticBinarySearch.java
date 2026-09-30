/*
Problem:
Search an element in either an ascending or descending sorted array.

Approach:
Determine the sorting order first, then perform Binary Search accordingly.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {20, 18, 15, 10, 8, 5, 2};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                sc.close();
                return;
            }

            if (isAscending) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        System.out.println("Element not found.");

        sc.close();
    }
}