import java.lang.Thread.State;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        DR("", target);
    }
    static void DR(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target &&  i<=6; i++) {
            DR(p+i, target-i);
        }
    }
}
