import java.util.*;
public class SumOfN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sum(n));
    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        return Sum(n-1)+n;
    }
}