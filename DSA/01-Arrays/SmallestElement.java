/*
Problem:
Find the smallest element in an array.

Approach:
Assume the first element is the smallest.
Traverse the array and update the minimum whenever a smaller element is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Smallest Element = " + min);

        sc.close();
    }
}