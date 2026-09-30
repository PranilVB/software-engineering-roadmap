import java.util.Scanner;
public class SumDigit {
public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SumD(n));
}
static int SumD(int n){
    if(n<10){
        return n;
    };
    return SumD(n/10)+SumD(n%10);
}
}
