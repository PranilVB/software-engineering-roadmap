/*
Problem:
Count the number of even elements in an array.

Approach:
Traverse the array and increment the counter whenever an even element is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CountEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int[] arr = new int[sc.nextInt()];

        int count = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                count++;
            }

        }

        System.out.println("Number of Even Elements = " + count);

        sc.close();
    }
}