/*
Problem:
Find the floor of a target.
(Floor = greatest element smaller than or equal to target.)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class Floor {

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
                System.out.println("Floor = " + arr[mid]);
                sc.close();
                return;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        if (end >= 0) {
            System.out.println("Floor = " + arr[end]);
        } else {
            System.out.println("Floor does not exist.");
        }

        sc.close();
    }
}