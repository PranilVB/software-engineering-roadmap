import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str=sc.nextLine();
        ReverseStr(str);
    }
    static void ReverseStr(String str){
        int i=str.length()-1;
        while(i>=0){
            System.out.print(str.charAt(i));
            i--;
        }
    }
}
