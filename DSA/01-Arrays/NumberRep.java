import java.util.*;
public class NumberRep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter a no.");
        int a=sc.nextInt();
        System.err.println("enter a no to check.");
        int b=sc.nextInt();
        int x=0;
        int c=a%10;
        while (a>0){
                
            if(c==b){
                x++;
                a=a/10;
            }
            
           
            
        } 
        System.out.println(x);
    }
}
