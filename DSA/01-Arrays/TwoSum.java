/*
Problem:
Find two indices whose elements add up to the target.

Approach:
Brute-force approach using two nested loops.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("Indices: " + i + " " + j);
                    found = true;
                    break;
                }

            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No valid pair found.");
        }

        sc.close();
    }
}