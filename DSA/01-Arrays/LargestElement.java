/*
Problem:
Find the largest element in an array.

Approach:
Assume the first element is the largest.
Traverse the array and update the maximum whenever a larger element is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Largest Element = " + max);

        sc.close();
    }
}