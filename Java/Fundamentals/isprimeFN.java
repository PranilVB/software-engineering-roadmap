import java.util.Scanner;

public class isprimeFN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        boolean A=prime(N);
        System.out.println(A);
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n) {
            if(n%c==0){
                return false;
            }
            c++;
        }
        if (c*c>n){
            return true;
        }
        return false;
    }
}
