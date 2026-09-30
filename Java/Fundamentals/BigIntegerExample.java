import java.math.BigInteger;

public class BigIntegerExample {

    public static void main(String[] args) {

        BigInteger A = BigInteger.valueOf(27388223);
        BigInteger B = BigInteger.valueOf(923489234893L);

        System.out.println(A);
        System.out.println(B);
        System.out.println("Addition is "+A.add(B));
    }
}