public class enumseg {
    enum Year{
        January, February, March, April, May, June, July, August, September, October, November, December
    }
    public static void main(String[] args) {
        Year year;
        for (Year year2 : Year.values()) {
            System.out.println(year2);
        }
    }
}
