import java.util.Scanner;

public class Product {
public static void main(String[] args) {
    
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Prod(n));
}
static int Prod(int n){
    if(n<10){
        return n;
    }
    return Prod(n/10)*Prod(n%10);
}
}
