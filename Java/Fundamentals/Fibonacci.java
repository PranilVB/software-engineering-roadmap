import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the seq");
        int f = sc.nextInt();
        int x = 0;
        int y = 1;
        for (int i = 0; i <= f; i++)
        {

       System.out.print(x + " ");

            int Z = x + y;
            x = y;
            y = Z;
        }
         System.err.println(x + "");
    }

}
