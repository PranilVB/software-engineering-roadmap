public class Armstrong {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int a) {
        int original = a;
        int sum = 0;

        while (a > 0) {
            int rem = a % 10;
            sum = sum + rem * rem * rem;
            a = a / 10;
        }

        return sum == original;
    }
}