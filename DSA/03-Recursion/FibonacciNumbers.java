/*
Problem: Fibonacci Number (LeetCode 509)

Description:
The Fibonacci numbers are defined as:
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1

Given n, return F(n).

Approach:
1. If n is less than 2, return n.
2. Otherwise, recursively compute:
   F(n) = F(n - 1) + F(n - 2)

Example:
Input:
n = 4

Output:
3

Explanation:
F(4) = F(3) + F(2)
     = (F(2) + F(1)) + (F(1) + F(0))
     = (1 + 1) + (1 + 0)
     = 3

Time Complexity: O(2^n)
Space Complexity: O(n)   // Recursive call stack

Status: Completed
*/

public class FibonacciNumber {

    public static int fib(int n) {

        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println(fib(n));
    }
}