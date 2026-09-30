import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle(n) ;
    }
    static void Triangle(int n){
        char ch='*';
        if (n==0) {
        return ;
        }
  for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();
Triangle(n-1);
    }

}
