public class enumseg {
    enum Year{
        January, February, March, April, May, June, July, August, September, October, November, December
    }
    public static void main(String[] args) {
        Year year=Year.February;
        // Enum is a special Java type used to define a fixed set of named constant values.
        for (Year year2 : Year.values()) {
            System.out.println(year2);
        }
        System.out.println(year);
        System.out.println(Year.October);
        System.out.println(Year.valueOf("December"));
    }
}
