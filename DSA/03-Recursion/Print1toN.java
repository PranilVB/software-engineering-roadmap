import java.util.Scanner;
public class Print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printn(n);
    }
    static void printn(int n){
        if(n==0){

            return ;
        }
        printn(n-1);                    
        System.out.println(n);

    }
    
}
