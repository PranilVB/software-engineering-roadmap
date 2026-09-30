import java.util.Scanner;

public class TriangleRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        Triangle(n, i);
    }

    static void Triangle(int n, int i) {
        if (n == 0) {
            return;
        }

        for (int h = 0; h <= i; h++) {
            System.out.print("*");
        }
        System.out.println();
         Triangle(n-1, i+1);
    }
}
