import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of max wirth");
        int w = sc.nextInt();
        System.out.println();

        for (int i = 0; i <= w/2; i++) {
            for (int j = w/2-i; j>0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2+1; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
        for (int i = w/2-1; i >=0; i--) {
            for (int j =w/2-i ; j>0 ; j--) {
                System.out.print(" ");
            }
            for (int j =0 ; j <i*2+1; j++) {
                System.out.print("*");
            }
             System.out.println();
        }

       
    }

}
