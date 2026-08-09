public class AllUseOfStatic {
    

    static int population = 0;

    static final double PI = 3.14159;

    static {
        System.out.println("Static block executed");
    }

    static void showPopulation() {
        System.out.println("Population: " + population);
    }

    AllUseOfStatic() {
        population++;
    }

    public static void main(String[] args) {

        AllUseOfStatic obj1 = new AllUseOfStatic();
        AllUseOfStatic obj2 = new AllUseOfStatic();
        AllUseOfStatic obj3 = new AllUseOfStatic();

        System.out.println("Population: " + AllUseOfStatic.population);

        AllUseOfStatic.showPopulation();

        System.out.println("PI: " + AllUseOfStatic.PI);
    }
}

