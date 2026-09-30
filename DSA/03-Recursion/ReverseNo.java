import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Rev(n));}
        static int Rev(int n){
            if(n<10){
                return n;
            }
            int digits = (int)Math.log10(n);
            return Rev(n/10)+Rev(n % 10) * (int)Math.pow(10, digits);
        }
    
}
