import java.util.*;

public class methods1sum {

    public static void main(String[] args) {
        int ans=sum();
        System.err.println(ans);
    }
    static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter int for addition" );
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int add=N1+N2;
        return add;
    }
}