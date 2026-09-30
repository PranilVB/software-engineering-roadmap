import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter range :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FindFactorial(n));;
    }
     static int FindFactorial(int n){
        if(n==1 || n==0){
           return 1;
        }
        return n*FindFactorial(n-1);

    }
}
