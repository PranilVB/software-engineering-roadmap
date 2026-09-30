/*
Problem: Valid Palindrome (LeetCode 125)

Description:
Given a string, determine if it is a palindrome after converting all
uppercase letters to lowercase and removing all non-alphanumeric characters.

Approach:
1. Traverse the string.
2. Keep only letters and digits using Character.isLetterOrDigit().
3. Convert all characters to lowercase and store them in a StringBuilder.
4. Use two pointers:
   - Left pointer starts at index 0.
   - Right pointer starts at the last index.
5. Compare characters from both ends.
6. If any pair differs, return false.
7. If all pairs match, return true.

Example:
Input:
"A man, a plan, a canal: Panama"

Cleaned String:
"amanaplanacanalpanama"

Output:
true

Time Complexity: O(n)
Space Complexity: O(n)

Status: Completed
*/

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {

            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
