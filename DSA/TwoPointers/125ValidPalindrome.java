package TwoPointers;

public class 125ValidPalindrome {
 class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if (Character.isLetterOrDigit(ch)) {
        sb.append(Character.toLowerCase(ch));
    }
}

String cleaned = sb.toString();
int i=0;
int mid=sb.length()/2;
while(i<mid){
    char start=sb.charAt(i);
    char end=sb.charAt(sb.length()-1-i);
    if(start!=end){
        return false;
    }
    else{
        i++;
    }
}
return true;
    }
}   
}
