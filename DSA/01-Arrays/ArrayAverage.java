/*
Problem:
Find the average of all elements in an array.

Approach:
Find the sum of all elements and divide it by the number of elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);

        sc.close();
    }
}