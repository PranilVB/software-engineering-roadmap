public class Greatest_of_three {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 1;

        System.out.println(greatNo(a, b, c));
    }

    static int greatNo(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}