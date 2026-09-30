/*
Problem:
Find the sum of all elements in an array.

Approach:
Traverse the array and keep adding each element to a sum variable.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}