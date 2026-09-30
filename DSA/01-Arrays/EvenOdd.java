import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element");
        int n=sc.nextInt();
        OddEven(n);
    }
    public static void OddEven(int n){
        
        if((n & 1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("even");
        }
    }
}
