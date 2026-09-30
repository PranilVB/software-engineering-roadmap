/*
Problem:
Reverse an array in-place.

Approach:
Use two pointers:
- Left starts from index 0.
- Right starts from the last index.
Swap both elements and move the pointers towards the center.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}