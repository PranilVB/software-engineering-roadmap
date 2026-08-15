import java.math.BigDecimal;

public class BigDecimalEg {
public static void main(String[] args) {
    double a=0.00001;
    double b=0.00002;
    double c=b-a;
    System.out.println("Normal :"+c);
    BigDecimal A=BigDecimal.valueOf(a);
    BigDecimal B=BigDecimal.valueOf(b);
    System.out.println("Big Decimal :"+B.subtract(A));
}    
}
