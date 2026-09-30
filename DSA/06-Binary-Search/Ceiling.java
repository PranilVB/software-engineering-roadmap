/*
Problem:
Find the ceiling of a target.
(Ceiling = smallest element greater than or equal to target.)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class Ceiling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 5, 8, 10, 14, 18};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Ceiling = " + arr[mid]);
                sc.close();
                return;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        if (start < arr.length) {
            System.out.println("Ceiling = " + arr[start]);
        } else {
            System.out.println("Ceiling does not exist.");
        }

        sc.close();
    }
}