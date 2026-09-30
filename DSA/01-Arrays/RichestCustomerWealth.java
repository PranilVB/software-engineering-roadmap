/*
Problem:
Find the maximum wealth among all customers.

Approach:
Calculate the sum of each row.
Keep track of the maximum sum.

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of banks: ");
        int cols = sc.nextInt();

        int[][] accounts = new int[rows][cols];

        System.out.println("Enter wealth values:");

        int maxWealth = 0;

        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < cols; j++) {

                accounts[i][j] = sc.nextInt();
                sum += accounts[i][j];

            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }

        }

        System.out.println("Maximum Wealth = " + maxWealth);

        sc.close();
    }
}