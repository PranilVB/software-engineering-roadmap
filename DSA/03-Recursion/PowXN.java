/*
Problem: Pow(x, n) (LeetCode 50)

Description:
Implement pow(x, n), which calculates x raised to the power n (xⁿ).

Approach:
1. Convert the exponent to long to handle Integer.MIN_VALUE.
2. If the exponent is negative:
   - Replace x with 1 / x.
   - Make the exponent positive.
3. Use Binary Exponentiation (Recursion):
   - Base Case:
     - If exponent is 0, return 1.
   - Recursively compute x^(n/2).
   - If n is even:
       xⁿ = (x^(n/2))²
   - If n is odd:
       xⁿ = x × (x^(n/2))²

Example:
Input:
x = 2.0
n = 13

Execution:
pow(2,13)
→ pow(2,6)
→ pow(2,3)
→ pow(2,1)
→ pow(2,0)
→ return 1
→ return 2
→ return 8
→ return 64
→ return 8192

Output:
8192.0

Time Complexity: O(log n)
Space Complexity: O(log n)   // Recursive call stack

Status: Completed
*/

public class PowXN {

    public static double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return pow(x, power);
    }

    private static double pow(double x, long n) {

        if (n == 0) {
            return 1;
        }

        double half = pow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public static void main(String[] args) {

        double x = 2.0;
        int n = 13;

        System.out.println(myPow(x, n));
    }
}