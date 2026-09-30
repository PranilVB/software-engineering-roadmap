import java.util.*;
public class Search_Char_In_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        char to_search=sc.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (string.length()==0) {
                System.out.println("string is empty");  
            }
            if(to_search==string.charAt(i)){
                System.out.println("the character is present in string at index of"+i);
            }
            
        }
    }
    
}
