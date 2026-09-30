import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to check-");
        String palindrome=sc.nextLine();
        System.out.println(IsPalindrome(palindrome.toLowerCase()));
    }
    static boolean IsPalindrome(String palindrome){

        for (int i = 0; i <=palindrome.length()/2; i++) {
        char start=palindrome.charAt(i);
        char end=palindrome.charAt(palindrome.length()-1-i);
        if(start!=end){
            return false;
        }
        }
        return true;
    }
}
